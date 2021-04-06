package com.alie.libdesignmodebehavior.strategy

class Player {
    var mPlayBlackFlag:IPlayBlackFlag? = null
    fun doPlay() {
        mPlayBlackFlag?.doSeaBattle()
    }
}