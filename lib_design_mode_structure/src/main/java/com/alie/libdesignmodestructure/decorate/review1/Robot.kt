package com.alie.libdesignmodestructure.decorate.review1

interface Robot {
    fun walk()
    fun speak()
}

class RobotImpl:Robot {
    override fun walk() {
        println("===walk")
    }

    override fun speak() {
        println("===speak")
    }
}