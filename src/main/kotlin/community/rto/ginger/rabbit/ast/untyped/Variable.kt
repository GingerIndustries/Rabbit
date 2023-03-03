package community.rto.ginger.rabbit.ast.untyped

import community.rto.ginger.rabbit.ast.common.FullIdentifier
import community.rto.ginger.rabbit.ast.common.Location

class UntypedAssignment(
                val name: FullIdentifier,
                val value: UntypedExpression,
                location: Location
) : UntypedNode(listOf(value), location)

class UntypedVariableAccess(val name: FullIdentifier, location: Location) :
                UntypedExpression(emptyList(), location) {
        override fun toString(): String {
                return "UntypedVariableAccess($name)"
        }
}
