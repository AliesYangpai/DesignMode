package org.alie.designmode.createmode.factory.abstractfactory.bean

import org.alie.designmode.createmode.factory.abstractfactory.Animal

class Cow : Animal() {
    override fun eat(food: String) {
        println("===eat $food")
    }

    override fun sleep() {
        println("===sleep cow")
    }
}