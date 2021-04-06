package com.alie.libdesignmodebehavior.state

class AlieBean  {
    var mPersonalState:BasePersonalEmotionState? = null
    fun doDaily() {
        mPersonalState?.doDailyActive()
    }
}