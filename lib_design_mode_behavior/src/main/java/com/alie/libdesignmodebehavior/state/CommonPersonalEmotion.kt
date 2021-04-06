package com.alie.libdesignmodebehavior.state

class CommonPersonalEmotion(private var iDailyWork: IDailyWork?) : BasePersonalEmotionState(iDailyWork) {
    override fun doDailyActive() {
        iDailyWork?.eat()
        iDailyWork?.study()
        iDailyWork?.play()
    }
}