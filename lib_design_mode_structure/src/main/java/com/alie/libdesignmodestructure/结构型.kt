package com.alie.libdesignmodestructure

import com.alie.libdesignmodestructure.adapter.CarToy
import com.alie.libdesignmodestructure.decorate.G1Bot
import com.alie.libdesignmodestructure.decorate.G1BotDecorate
import com.alie.libdesignmodestructure.facade.Person
import com.alie.libdesignmodestructure.flyweight.WeaponPool

/**
 * 装饰模式
 */
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

/**
 * 适配器模式
 */
fun doTest02() {
    var carToy = CarToy("越野遥控赛车")
    carToy.mVoltage = 3F // 这里可以指定代表当前的供电；0F：代表未上
    carToy.doPlay()
}

/**
 * 外观模式
 */
fun doTest03() {
    val person = Person("老张")
    person.proveYourSelf()
}

/**
 * 享元模式
 */
fun doTest04() {
    WeaponPool().let {
        it.getWeapon("A")?.attack()
        it.getWeapon("B")?.attack()
        it.getWeapon("C")?.attack()
        it.getWeapon("B")?.attack()
        it.getWeapon("xxxxx")?.attack()
    }
}
fun main(array: Array<String>) {
//    doTest01()//【装饰模式】老张爆改机器人
//    doTest02()//【适配器模式】玩具车上电
//    doTest03()//【外观模式】老张办手续
    doTest04();//【享元模式】老张拿武器
}