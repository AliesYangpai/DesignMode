package com.alie.libdesignmodestructure.decorate

/**
 * 装饰器类。
 * 个人觉得，装饰器的作用是拓展接口，而不是在原有已实现的接口上修改。
 * 这个要和适配器有趣被
 */
class G1BotDecorate(var mRawRobot: G1Bot?): IRobot {
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