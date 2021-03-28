package com.alie.libdesignmodebehavior.observer.part1kt

fun main(array: Array<String>) {
    doTest01()
}

fun doTest01() {
    var zhangXiaoSan = ZhangXiaoSan()
    println("===zhangXiaoSan start borrow money")
    zhangXiaoSan.borrow(RichGoodMan1())
    zhangXiaoSan.borrow(RichGoodMan2())
    zhangXiaoSan.borrow(RichGoodMan3())

    Thread.sleep(3000)
    println("after 3s ,he start to repay")
    zhangXiaoSan.notifyLender()
}