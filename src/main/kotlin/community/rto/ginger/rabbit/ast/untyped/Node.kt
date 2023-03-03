package community.rto.ginger.rabbit.ast.untyped

import community.rto.ginger.rabbit.ast.common.Location

sealed class UntypedNode(val children: List<UntypedNode>, val location: Location) {
    override fun toString(): String {
        return "${this::class.simpleName}(${children.joinToString(", ")})"
    }
    fun flatten(): List<UntypedNode> {
        return listOf(this) + this.children.flatMap { it.flatten() }
    }
}

class UntypedStatements(children: List<UntypedNode>) :
        UntypedNode(children, children.first().location)

class UntypedPass(location: Location) : UntypedNode(emptyList(), location) {
    override fun toString(): String {
        return "pass"
    }
}
