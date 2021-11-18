package com.alie.libdesignmodebehavior.strategy.review1

class WashManger private constructor(){
    companion object {
        val INSTANCE by lazy { WashManger() }
    }

    fun wash(strategy: WashStrategy){
        strategy.wash()
    }

    fun spinDry(strategy: SpinDryStrategy) {
        strategy.spinDry()
    }
}