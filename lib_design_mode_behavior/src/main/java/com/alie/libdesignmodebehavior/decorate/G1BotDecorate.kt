package com.alie.libdesignmodebehavior.decorate

class G1BotDecorate(var mRawRobot:G1Bot?):IRobot {
    override fun speak() {
        mRawRobot?.speak()
    }

    override fun sing() {
        mRawRobot?.sing()
    }
    fun decorateDance() {
        println("${mRawRobot?.name} 跳舞")
    }

    fun decorateSweep() {
        println("${mRawRobot?.name} 扫地")
    }
}