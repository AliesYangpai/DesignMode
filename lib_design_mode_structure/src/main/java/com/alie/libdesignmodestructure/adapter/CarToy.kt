package com.alie.libdesignmodebehavior.adapter


class CarToy(var mName: String = "", var mVoltage: Float = 0F ) {

    private var mVoltageAdapter =PowerAdapter()

    /**
     * doPlay方法也有点外观模式的意思
     */
    fun doPlay() {
        val currentVoltage = mVoltageAdapter.transVoltageTo1_5(mVoltage)
        when (currentVoltage) {
            1.5F -> {
                powerOn()
                running()
                powerOn()
            }
            else -> println("电压不支持")
        }
    }

    private fun powerOn() {
        println("$mName 打开电源 ")
    }

    private fun running() {
        println("$mName 小车跑动啦~~")
    }

    private fun powerOff() {
        println("$mName 关闭电源")
    }
}