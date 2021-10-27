package com.alie.libdesignmodestructure

import com.alie.libdesignmodestructure.decorate.G1Bot
import com.alie.libdesignmodestructure.decorate.G1BotDecorate
import com.alie.libdesignmodestructure.decorate.review1.RobotExpandImpl
import com.alie.libdesignmodestructure.decorate.review1.RobotImpl
import com.alie.libdesignmodestructure.facade.Person
import com.alie.libdesignmodestructure.flyweight.WeaponPool
import com.alie.libdesignmodestructure.proxy.AlieDbServer
import com.alie.libdesignmodestructure.proxy.AlieDbServerProxy

fun main(array: Array<String>) {
//    doTest01()//【装饰模式】老张爆改机器人
//    doTest02()//【适配器模式】充电桩给汽车充电
//    doTest03()//【外观模式】老张办手续
//    doTest04()//【享元模式】老张拿武器
//    doTest05()//【结构型-装饰器】改造机器人
    doTest06()//【结构型-代理】服务器使用
}


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
fun doTest02() {}

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

/**
 * 装饰器模式
 * 顾名思义，目的是能扩展当前target的功能
 * 【个人理解，这里应该仅仅是装点扩展】
 *  也就是说在target原有基础上完全可以加一些其他的功能 而不会更改target内部
 */
fun doTest05() {
    println("===fun doTest05()")
    val robot = RobotImpl()
    val robotExpand = RobotExpandImpl(robot)
    robotExpand.walk()
    robotExpand.speak()
    robotExpand.dance()
    robotExpand.clean()
    robotExpand.cook()

}

/**
 * 代理模式
 * ！！！！！！！【注 非常非常之重要】！！！！！！！
 * 装饰器、适配器的思路也是基于“代理”的，这里我们应该看到的
 * 是这种思想以这种前提去学习代码
 */
fun doTest06() {
    println("===doTest06")
    val dbServer = AlieDbServer()
    val dbServerProxy = AlieDbServerProxy(dbServer)
    dbServerProxy.init()
    dbServerProxy.connect()
    dbServerProxy.shutDown()
}