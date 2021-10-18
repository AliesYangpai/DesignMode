package com.alie.libdesignmodecreate.createmode.factory.methodfactory.review1

abstract class BasePhone {
    protected val name = this.javaClass.simpleName
    abstract fun call()
    abstract fun playGame()
}


class SmartPhone : BasePhone() {
    override fun call() {
      println("$name call")
    }

    override fun playGame() {
        println("$name playGame")
    }
}

class OldPhone : BasePhone() {
    override fun call() {
        println("$name call")
    }

    override fun playGame() {
        println("$name playGame")
    }
}

class SpecialPhone : BasePhone() {
    override fun call() {
        println("$name call")
    }

    override fun playGame() {
        println("$name playGame")
    }
}