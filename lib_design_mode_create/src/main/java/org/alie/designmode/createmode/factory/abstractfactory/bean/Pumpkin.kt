package org.alie.designmode.createmode.factory.abstractfactory.bean

import org.alie.designmode.createmode.factory.abstractfactory.Plant

class Pumpkin:Plant() {
    override fun watered() {
       println("===Pumpkin watered")
    }

    override fun bloom() {
        println("===Pumpkin bloom")
    }
}