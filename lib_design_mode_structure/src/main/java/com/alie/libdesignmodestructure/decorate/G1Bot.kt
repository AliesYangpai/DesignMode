package com.alie.libdesignmodestructure.decorate



class G1Bot(var name:String = ""): IRobot {
    override fun speak() {
        println("$name 说话")
    }

    override fun sing() {
        println("$name 唱歌")
    }
}