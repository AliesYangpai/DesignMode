package com.alie.libdesignmodecreate.createmode.factory.methodfactory.kt

class CarToy: Toy() {
    override fun loadBattery(battery: String) {
        println("===loadBattery $battery")
    }

    override fun turnOn() {
        println("===turnOn moving")
    }

    override fun turnOff() {
        println("===turnOff stop")
    }
}