package org.alie.designmode.createmode.factory.abstractfactory.bean

import org.alie.designmode.createmode.factory.abstractfactory.Tool

class Sickle : Tool() {
    override fun using() {
        println("===Sickle=== using")
    }

    override fun fix() {
        println("===Sickle=== using")
    }
}