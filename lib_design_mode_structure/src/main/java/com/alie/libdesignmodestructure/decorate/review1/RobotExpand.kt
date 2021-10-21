package com.alie.libdesignmodestructure.decorate.review1


interface RobotExpand : Robot {
    fun dance()
    fun cook()
    fun clean()
}

class RobotExpandImpl(private val robot: Robot) : RobotExpand {
    override fun dance() {
        println("==diy dance")
    }

    override fun walk() {
        robot.walk()
    }

    override fun cook() {
        println("==diy cook")
    }

    override fun clean() {
        println("==diy clean")
    }

    override fun speak() {
        robot.speak()
    }


}