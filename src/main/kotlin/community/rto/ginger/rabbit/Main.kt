package community.rto.ginger.rabbit

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.types.file
import org.antlr.v4.runtime.CharStreams

import community.rto.ginger.rabbit.interpreter.RabbitInterpreter

fun main(args: Array<String>) = RabbitArgsParser().main(args)

private class RabbitArgsParser: CliktCommand(name = "rabbit") {
    val file by argument(help = "Bingus test file").file(mustExist = true, canBeDir = false, mustBeReadable = true)  
    //val module by argument(help = "The module to run")

    override fun run() {
        var interpreter = RabbitInterpreter()
        interpreter.run(CharStreams.fromPath(file.toPath()))
    }
}