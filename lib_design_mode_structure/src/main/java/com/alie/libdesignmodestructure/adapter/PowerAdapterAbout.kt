package com.alie.libdesignmodestructure.adapter

interface IPowerAdapter {
    fun transVoltageTo1_5(currentVoltage: Float): Float
}

class PowerAdapter : IPowerAdapter {

    override fun transVoltageTo1_5(currentVoltage: Float): Float = when (currentVoltage) {
        0F, 1.5F -> currentVoltage
        else -> {
            1.5F
        }
    }
}