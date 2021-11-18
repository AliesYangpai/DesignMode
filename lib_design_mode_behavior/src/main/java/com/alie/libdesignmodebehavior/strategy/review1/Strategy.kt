package com.alie.libdesignmodebehavior.strategy.review1

interface Strategy

interface WashStrategy:Strategy {
    fun wash()
}

interface SpinDryStrategy:Strategy{
    fun spinDry()
}

class StanderWash:WashStrategy{
    override fun wash() {
        println("===StanderWash wash")
    }
}

class FastWash:WashStrategy{
    override fun wash() {
        println("===FastWash wash")
    }
}

class StanderDry:SpinDryStrategy{
    override fun spinDry() {
        println("===StanderDry spinDry")
    }
}

class FastDry:SpinDryStrategy{
    override fun spinDry() {
        println("===FastDry FastDry")
    }

}

