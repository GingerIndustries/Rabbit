package community.rto.ginger.rabbit.parser

import community.rto.ginger.rabbit.antlr.RabbitParser
import community.rto.ginger.rabbit.antlr.RabbitParserBaseVisitor
import community.rto.ginger.rabbit.ast.common.Argument
import community.rto.ginger.rabbit.ast.common.BinaryExpressionType
import community.rto.ginger.rabbit.ast.common.FunctionModifier
import community.rto.ginger.rabbit.ast.common.FunctionType
import community.rto.ginger.rabbit.ast.common.Location
import community.rto.ginger.rabbit.ast.common.NothingType
import community.rto.ginger.rabbit.ast.common.PrefixExpressionType
import community.rto.ginger.rabbit.ast.common.TypeParams
import community.rto.ginger.rabbit.ast.common.location
import community.rto.ginger.rabbit.ast.common.toFullIdentifier
import community.rto.ginger.rabbit.ast.common.toIdentifier
import community.rto.ginger.rabbit.ast.common.toType
import community.rto.ginger.rabbit.ast.untyped.UntypedAssignment
import community.rto.ginger.rabbit.ast.untyped.UntypedBinaryExpression
import community.rto.ginger.rabbit.ast.untyped.UntypedBooleanLiteral
import community.rto.ginger.rabbit.ast.untyped.UntypedElseIfCase
import community.rto.ginger.rabbit.ast.untyped.UntypedExpression
import community.rto.ginger.rabbit.ast.untyped.UntypedForStatement
import community.rto.ginger.rabbit.ast.untyped.UntypedFunctionCall
import community.rto.ginger.rabbit.ast.untyped.UntypedFunctionDeclaration
import community.rto.ginger.rabbit.ast.untyped.UntypedIfStatement
import community.rto.ginger.rabbit.ast.untyped.UntypedIfWhileStatement
import community.rto.ginger.rabbit.ast.untyped.UntypedNode
import community.rto.ginger.rabbit.ast.untyped.UntypedNumberLiteral
import community.rto.ginger.rabbit.ast.untyped.UntypedPass
import community.rto.ginger.rabbit.ast.untyped.UntypedPrefixExpression
import community.rto.ginger.rabbit.ast.untyped.UntypedStatements
import community.rto.ginger.rabbit.ast.untyped.UntypedStringLiteral
import community.rto.ginger.rabbit.ast.untyped.UntypedStructDeclaration
import community.rto.ginger.rabbit.ast.untyped.UntypedStructDeclarationTraitImplementation
import community.rto.ginger.rabbit.ast.untyped.UntypedTraitDeclaration
import community.rto.ginger.rabbit.ast.untyped.UntypedTraitImplementation
import community.rto.ginger.rabbit.ast.untyped.UntypedVariableAccess
import community.rto.ginger.rabbit.ast.untyped.UntypedWhileStatement

class RabbitVisitor : RabbitParserBaseVisitor<UntypedNode>() {
        override fun visitStatements(ctx: RabbitParser.StatementsContext): UntypedStatements {
                return UntypedStatements(
                                ctx.statement().map(this::visit).flatMap(this::flattenStatements)
                )
        }

        override fun visitExpression(ctx: RabbitParser.ExpressionContext): UntypedExpression {
                return when {
                        ctx.atom() != null -> this.visitAtom(ctx.atom())
                        ctx.prefixOp != null ->
                                        UntypedPrefixExpression(
                                                        this.visitExpression(ctx.expression(0)),
                                                        PrefixExpressionType.fromSymbol(
                                                                        ctx.prefixOp.text
                                                        ),
                                                        ctx.location
                                        )
                        ctx.op != null ->
                                        UntypedBinaryExpression(
                                                        this.visitExpression(ctx.expression(0)),
                                                        this.visitExpression(ctx.expression(1)),
                                                        BinaryExpressionType.fromSymbol(
                                                                        ctx.op.text
                                                        ),
                                                        ctx.location
                                        )
                        ctx.RPAREN() != null ->
                                        UntypedFunctionCall(
                                                        this.visitExpression(ctx.expression(0)),
                                                        ctx.args.map(this::visitExpression),
                                                        ctx.location
                                        )
                        else -> throw AssertionError("?!")
                }
        }
        override fun visitAtom(ctx: RabbitParser.AtomContext): UntypedExpression {
                return when {
                        ctx.boolean_literal() != null ->
                                        UntypedBooleanLiteral(
                                                        ctx.boolean_literal().value.type ==
                                                                        RabbitParser.TRUE,
                                                        ctx.location
                                        )
                        ctx.number() != null ->
                                        UntypedNumberLiteral(
                                                        ctx.number().text.toBigDecimal(),
                                                        ctx.location
                                        )
                        ctx.STRING() != null ->
                                        UntypedStringLiteral(ctx.STRING().text, ctx.location)
                        ctx.full_identifier() != null ->
                                        UntypedVariableAccess(
                                                        ctx.full_identifier().toFullIdentifier(),
                                                        ctx.location
                                        )
                        else -> this.visitChildren(ctx) as UntypedExpression
                }
        }

        override fun visitFunction_declaration(
                        ctx: RabbitParser.Function_declarationContext
        ): UntypedFunctionDeclaration {
                val modifiers =
                                ctx.function_modifier()
                                                .map {
                                                        with(it.modifier.type) {
                                                                when (this) {
                                                                        RabbitParser.MAIN ->
                                                                                        FunctionModifier.MAIN
                                                                        RabbitParser.STATIC ->
                                                                                        FunctionModifier.STATIC
                                                                        RabbitParser.OVERRIDE ->
                                                                                        FunctionModifier.OVERRIDE
                                                                        RabbitParser.ABSTRACT ->
                                                                                        FunctionModifier.ABSTRACT
                                                                        else ->
                                                                                        throw AssertionError()
                                                                }
                                                        }
                                                }
                                                .distinct()
                if (FunctionModifier.MAIN in modifiers && modifiers.size > 1)
                                error("main modifier cannot be used with other modifiers!")
                if (modifiers.containsAll(
                                                listOf(
                                                                FunctionModifier.STATIC,
                                                                FunctionModifier.ABSTRACT
                                                )
                                )
                )
                                error("static and abstract modifiers cannot be used together!")
                return UntypedFunctionDeclaration(
                                ctx.identifier().toIdentifier(),
                                ctx.return_type()?.type()?.toType() ?: NothingType,
                                ctx.argument_list().argument().map {
                                        Argument(it.identifier().toIdentifier(), it.type().toType())
                                },
                                when {
                                        ctx.functionType.type == RabbitParser.FUNCTION ->
                                                        FunctionType.FUNCTION
                                        ctx.functionType.type == RabbitParser.OPERATOR ->
                                                        FunctionType.OPERATOR
                                        else -> throw AssertionError("?!")
                                },
                                modifiers,
                                this.visitStatements(ctx.block().statements()),
                                ctx.type_params()?.type_param()?.map {
                                        TypeParams(
                                                        it.identifier().toIdentifier(),
                                                        it.full_identifier().map {
                                                                it.toFullIdentifier()
                                                        }
                                        )
                                },
                                ctx.location
                )
        }

        override fun visitStruct_declaration(
                        ctx: RabbitParser.Struct_declarationContext
        ): UntypedStructDeclaration {
                return UntypedStructDeclaration(
                                ctx.identifier().toIdentifier(),
                                UntypedStatements(ctx.struct_body().struct_item().map(this::visit)),
                                ctx.location
                )
        }
        override fun visitTrait_declaration(
                        ctx: RabbitParser.Trait_declarationContext
        ): UntypedTraitDeclaration {
                return UntypedTraitDeclaration(
                                ctx.identifier().toIdentifier(),
                                UntypedStatements(
                                                ctx.trait_declaration_body()
                                                                .trait_declaration_item()
                                                                .map(this::visit)
                                ),
                                ctx.extends_ident?.toFullIdentifier(),
                                ctx.location
                )
        }
        override fun visitTrait_implementation(
                        ctx: RabbitParser.Trait_implementationContext
        ): UntypedTraitImplementation {
                return UntypedTraitImplementation(
                                ctx.full_identifier(0).toFullIdentifier(),
                                ctx.full_identifier(1).toFullIdentifier(),
                                UntypedStatements(
                                                ctx.trait_implementation_body()
                                                                .trait_implementation_item()
                                                                .map(this::visit)
                                ),
                                ctx.location
                )
        }
        override fun visitStruct_declaration_trait_implementation(
                        ctx: RabbitParser.Struct_declaration_trait_implementationContext
        ): UntypedStructDeclarationTraitImplementation {
                return UntypedStructDeclarationTraitImplementation(
                                ctx.full_identifier().toFullIdentifier(),
                                UntypedStatements(
                                                ctx.trait_implementation_body()
                                                                .trait_implementation_item()
                                                                .map(this::visit)
                                ),
                                ctx.location
                )
        }

        override fun visitAssignment(ctx: RabbitParser.AssignmentContext): UntypedAssignment {
                return UntypedAssignment(
                                ctx.full_identifier().toFullIdentifier(),
                                this.visitExpression(ctx.expression()),
                                ctx.location
                )
        }

        override fun visitIf_statement(ctx: RabbitParser.If_statementContext): UntypedIfStatement {
                return UntypedIfStatement(
                                this.visitExpression(ctx.expression()),
                                this.visitStatements(ctx.block().statements()),
                                this.visitStatements(ctx.else_block().block().statements()),
                                ctx.else_if_block().map {
                                        UntypedElseIfCase(
                                                        this.visitExpression(it.expression()),
                                                        this.visitStatements(
                                                                        it.block().statements()
                                                        ),
                                                        it.location
                                        )
                                },
                                ctx.location
                )
        }

        override fun visitIf_while_statement(
                        ctx: RabbitParser.If_while_statementContext
        ): UntypedIfWhileStatement {
                return UntypedIfWhileStatement(
                                this.visitExpression(ctx.expression()),
                                this.visitStatements(ctx.block().statements()),
                                this.visitStatements(ctx.else_block().block().statements()),
                                ctx.location
                )
        }

        override fun visitWhile_statement(
                        ctx: RabbitParser.While_statementContext
        ): UntypedWhileStatement {
                return UntypedWhileStatement(
                                this.visitExpression(ctx.expression()),
                                this.visitStatements(ctx.block().statements()),
                                ctx.location
                )
        }
        override fun visitFor_statement(
                        ctx: RabbitParser.For_statementContext
        ): UntypedForStatement {
                return UntypedForStatement(
                                ctx.identifier().map { it.toIdentifier() },
                                this.visitExpression(ctx.expression()),
                                this.visitStatements(ctx.block().statements()),
                                ctx.location
                )
        }

        override fun aggregateResult(
                        aggregate: UntypedNode?,
                        nextResult: UntypedNode?
        ): UntypedNode {
                return nextResult ?: aggregate ?: UntypedPass(Location(0, 0))
        }

        private fun flattenStatements(node: UntypedNode): List<UntypedNode> {
                // This converts nested UntypedStatements nodes to a list of UntypedNodes
                if (node is UntypedStatements) {
                        return node.children.flatMap(this::flattenStatements)
                } else {
                        return listOf(node)
                }
        }
}
