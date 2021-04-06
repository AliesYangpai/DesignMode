package com.alie.libdesignmodebehavior.state

abstract class BasePersonalEmotionState(private var dailyWork:IDailyWork?) {
    abstract fun doDailyActive()
}