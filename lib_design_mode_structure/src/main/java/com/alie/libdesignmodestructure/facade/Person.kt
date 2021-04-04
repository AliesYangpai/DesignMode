package com.alie.libdesignmodebehavior.facade

class Person(var mName: String = "") {

    private val mPersonalOperate = PersonalOperate()

    fun proveYourSelf() {
        println("$mName proveYourSelf")
        mPersonalOperate.doProvePersonInfo()
    }
}