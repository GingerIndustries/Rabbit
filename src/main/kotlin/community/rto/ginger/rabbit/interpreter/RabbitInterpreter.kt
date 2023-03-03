package community.rto.ginger.rabbit.interpreter

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import community.rto.ginger.rabbit.antlr.*
import community.rto.ginger.rabbit.parser.RabbitVisitor

class RabbitInterpreter {
    fun parse(input: CharStream) = RabbitParser(CommonTokenStream(RabbitLexer(input))).program()

    fun run(input: CharStream) {
        var parsed = this.parse(input)
        var ast = parsed.accept(RabbitVisitor())
        println(ast)
    }
}