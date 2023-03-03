package community.rto.ginger.rabbit.ast.untyped

import community.rto.ginger.rabbit.ast.common.Argument
import community.rto.ginger.rabbit.ast.common.FunctionType
import community.rto.ginger.rabbit.ast.common.FunctionModifier
import community.rto.ginger.rabbit.ast.common.Identifier
import community.rto.ginger.rabbit.ast.common.Location
import community.rto.ginger.rabbit.ast.common.Type
import community.rto.ginger.rabbit.ast.common.TypeParams

class UntypedFunctionDeclaration(
        val name: Identifier,
        val returnType: Type,
        val arguments: List<Argument>,
        val type: FunctionType,
        val modifiers: List<FunctionModifier>,
        val body: UntypedStatements,
        val typeParams: List<TypeParams>? = null,
        location: Location
) : UntypedNode(listOf(body), location) {
    override fun toString(): String {
        return if (this.typeParams != null)
                "FunctionDeclaration(${modifiers.joinToString(" ", postfix = " ").lowercase()}${type.toString().lowercase()} $name<$typeParams>(${arguments.joinToString(", ")}) -> $returnType, $body)"
        else
                "FunctionDeclaration(${modifiers.joinToString(" ", postfix = " ").lowercase()}${type.toString().lowercase()} $name(${arguments.joinToString(", ")}) -> $returnType, $body)"
    }
}

class UntypedFunctionCall(
        val expr: UntypedExpression,
        val args: List<UntypedExpression>,
        location: Location
) : UntypedExpression(listOf(expr) + args, location)
