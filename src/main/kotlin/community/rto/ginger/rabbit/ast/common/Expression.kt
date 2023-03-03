package community.rto.ginger.rabbit.ast.common

enum class BinaryExpressionType(private val symbol: String) {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    MODULO("%"),

    GREATERTHAN(">"),
    LESSTHAN("<"),
    GREATEREQUAL(">="),
    LESSEQUAL("<="),
    EQUAL("==");

    override fun toString() = symbol

    companion object {
        fun fromSymbol(symbol: String): BinaryExpressionType {
            return values().first {it.symbol == symbol}
        }
    }
    
}

enum class PrefixExpressionType(private val symbol: String) {
    NOT("not");

    override fun toString() = symbol

    companion object {
        fun fromSymbol(symbol: String): PrefixExpressionType {
            return values().first {it.symbol == symbol}
        }
    }
}