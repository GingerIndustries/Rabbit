package community.rto.ginger.rabbit.ast.common

data class Argument(val name: Identifier, val type: Type)

enum class FunctionType {
    FUNCTION, OPERATOR, MAIN;
}
enum class FunctionModifier {
    STATIC, OVERRIDE, ABSTRACT, MAIN;
}