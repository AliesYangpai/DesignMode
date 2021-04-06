package com.alie.libdesignmodebehavior.state

class HappyPersonalEmotion(private var iDailyWork: IDailyWork?): BasePersonalEmotionState(iDailyWork) {

    override fun doDailyActive() {
        iDailyWork?.play()
        iDailyWork?.play()
        iDailyWork?.play()
    }
}