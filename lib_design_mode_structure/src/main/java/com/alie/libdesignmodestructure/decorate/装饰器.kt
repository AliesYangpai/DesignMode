package com.alie.libdesignmodebehavior

import com.alie.libdesignmodebehavior.decorate.G1Bot
import com.alie.libdesignmodebehavior.decorate.G1BotDecorate

fun main(array: Array<String>) {
    doTest01()
}


fun doTest01() {
    var bot1 = G1Bot("初代")
    bot1.speak()
    bot1.sing()

    println("alie 改造后：");
    G1BotDecorate(bot1).let {
        it.speak()
        it.sing()
        it.decorateDance()
        it.decorateSweep()
    }
}