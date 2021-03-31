package org.alie.designmode.createmode.factory.methodfactory.kt

class PlushToy: Toy() {
    override fun loadBattery(battery: String) {
        println("===loadBattery $battery")
    }

    override fun turnOn() {
        println("===turnOn barking !!!")
    }

    override fun turnOff() {
        println("===turnOff silence")
    }
}