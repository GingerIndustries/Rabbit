package community.rto.ginger.rabbit.ast.untyped

import community.rto.ginger.rabbit.ast.common.Location
import java.math.BigDecimal

sealed class UntypedLiteral(location: Location) : UntypedExpression(emptyList(), location)

class UntypedNumberLiteral(val value: BigDecimal, location: Location) : UntypedLiteral(location) {
    override fun toString(): String = value.stripTrailingZeros().toPlainString()
}

class UntypedStringLiteral(val value: String, location: Location) : UntypedLiteral(location) {
    override fun toString() = "\"$value\""
}

class UntypedBooleanLiteral(val value: Boolean, location: Location) : UntypedLiteral(location) {
    override fun toString() = value.toString()
}
