package community.rto.ginger.rabbit

import community.rto.ginger.rabbit.interpreter.RabbitInterpreter
import org.antlr.v4.runtime.CharStreams

fun main() {
    RabbitInterpreter().run(CharStreams.fromFileName("/home/ginger/Rabbit/test.rbt"))
}