package community.rto.ginger.rabbit.ast.common

import community.rto.ginger.rabbit.antlr.RabbitParser
import community.rto.ginger.rabbit.ast.common.toFullIdentifier

class TypeParams(val name: Identifier, val traits: List<FullIdentifier>)
open class Type(val name: FullIdentifier, val genericParams: List<Type>) {
    override fun toString(): String {
        return if (!this.genericParams.isEmpty()) "Type($name, <$genericParams>)" else "Type($name)"
    }
}
object NothingType : Type(FullIdentifier(Identifier("NOTHING")), listOf<Type>())
object NeverType : Type(FullIdentifier(Identifier("NEVER")), listOf<Type>())

fun RabbitParser.TypeContext.toType(): Type {
    return when {
        this.full_identifier() != null -> Type(this.full_identifier().toFullIdentifier(), this.type().map { it.toType() })
        this.NOTHING() != null -> NothingType
        this.NEVER() != null -> NeverType
        else -> throw AssertionError("?!")
    }
}