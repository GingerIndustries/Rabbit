package community.rto.ginger.rabbit.ast.common

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.misc.Interval

data class Location(val row: Int, val column: Int, val file: String? = null, val text: String? = null)

val ParserRuleContext.location: Location
    get() = Location(
        start.line,
        start.charPositionInLine,
        null,
        start.inputStream.getText(Interval(start.startIndex, stop.stopIndex))
    )