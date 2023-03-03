package community.rto.ginger.rabbit.ast.common

import community.rto.ginger.rabbit.antlr.RabbitParser

class Identifier(val name: String, val pkg: String? = null) {
    override fun toString(): String {
        return if (this.pkg != null) "$pkg:$name" else name
    }
    companion object {
        private const val MODULE_SEPARATOR = ':'
        fun parse(string: String): Identifier {
            with(string.split(MODULE_SEPARATOR)) {
                return Identifier(last(), if (size == 2) first() else null)
            }
        }
    }
}

class FullIdentifier(val identifier: Identifier, val child: FullIdentifier? = null) {
    override fun toString(): String {
        return if (this.child != null) this.identifier.toString() + "." + this.child.toString()
        else this.identifier.toString()
    }
}

fun RabbitParser.IdentifierContext.toIdentifier(): Identifier {
    return Identifier(this.ident.text, this.packageName?.text)
}

fun RabbitParser.Full_identifierContext.toFullIdentifier(): FullIdentifier {
    return FullIdentifier(
            Identifier(this.ident.text, this.packageName?.text),
            this.full_identifier()?.toFullIdentifier()
    )
}
