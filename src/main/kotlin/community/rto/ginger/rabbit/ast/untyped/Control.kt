package community.rto.ginger.rabbit.ast.untyped

import community.rto.ginger.rabbit.ast.common.Location
import community.rto.ginger.rabbit.ast.common.Identifier

sealed class UntypedControlStatement(children: List<UntypedNode>, location: Location) :
                UntypedNode(children, location)

class UntypedElseIfCase(
                val expression: UntypedExpression,
                val block: UntypedStatements,
                location: Location
) : UntypedControlStatement(listOf(expression, block), location)

open class UntypedIfStatement(
                val condition: UntypedExpression,
                val trueCase: UntypedStatements,
                val falseCase: UntypedStatements? = null,
                val elseIfCases: List<UntypedElseIfCase>? = null,
                location: Location
) :
                UntypedControlStatement(
                                listOfNotNull(condition, trueCase, falseCase) +
                                                (elseIfCases ?: emptyList()),
                                location
                )

class UntypedIfWhileStatement(
                condition: UntypedExpression,
                trueCase: UntypedStatements,
                falseCase: UntypedStatements? = null,
                location: Location
) : UntypedIfStatement(condition, trueCase, falseCase, null, location)

class UntypedWhileStatement(
                val condition: UntypedExpression,
                val block: UntypedStatements,
                location: Location
) : UntypedControlStatement(listOf(condition, block), location)

class UntypedForStatement(
                val variables: List<Identifier>,
                val expression: UntypedExpression,
                val block: UntypedStatements,
                location: Location
) : UntypedNode(listOf(expression, block), location)
