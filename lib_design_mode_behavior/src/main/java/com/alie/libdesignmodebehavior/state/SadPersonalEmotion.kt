package com.alie.libdesignmodebehavior.state

class SadPersonalEmotion(private var iDailyWork: IDailyWork?) : BasePersonalEmotionState(iDailyWork) {
    override fun doDailyActive() {
        iDailyWork?.play()
    }
}