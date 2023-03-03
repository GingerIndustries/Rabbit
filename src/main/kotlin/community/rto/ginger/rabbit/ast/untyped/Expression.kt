package community.rto.ginger.rabbit.ast.untyped

import community.rto.ginger.rabbit.ast.common.BinaryExpressionType
import community.rto.ginger.rabbit.ast.common.PrefixExpressionType
import community.rto.ginger.rabbit.ast.common.Location

sealed class UntypedExpression(children: List<UntypedNode>, location: Location) :
        UntypedNode(children, location)

class UntypedBinaryExpression(
        val leftExpr: UntypedExpression,
        val rightExpr: UntypedExpression,
        val type: BinaryExpressionType,
        location: Location
) : UntypedExpression(listOf(leftExpr, rightExpr), location) {
    override fun toString(): String {
        return "UntypedBinaryExpression($leftExpr $type $rightExpr)"
    }
}

class UntypedPrefixExpression(val expr: UntypedExpression, val type: PrefixExpressionType, location: Location): UntypedExpression(listOf(expr), location) {
    override fun toString(): String {
        return "UntypedPrefixExpression($expr $type)"
    }
}
