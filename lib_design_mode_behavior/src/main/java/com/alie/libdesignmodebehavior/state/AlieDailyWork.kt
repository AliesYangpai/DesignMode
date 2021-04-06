package com.alie.libdesignmodebehavior.state

class AlieDailyWork:IDailyWork {
    override fun eat() {
        println("===吃包子")
    }

    override fun study() {
        println("===学习c++与java")
    }

    override fun play() {
        println("===玩两把海战~~")
    }
}