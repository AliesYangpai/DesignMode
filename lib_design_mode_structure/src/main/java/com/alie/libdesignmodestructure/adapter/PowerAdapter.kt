package com.alie.libdesignmodebehavior.adapter

class PowerAdapter : IPowerAdapter {
    //    override fun transVoltageTo1_5(currentVoltage: Float): Float = currentVoltage.let {
//        when (it) {
//            0F, 1.5F -> it
//            else -> {
//                1.5F
//            }
//        }
//    }
    override fun transVoltageTo1_5(currentVoltage: Float): Float = when (currentVoltage) {
        0F, 1.5F -> currentVoltage
        else -> {
            1.5F
        }
    }
}