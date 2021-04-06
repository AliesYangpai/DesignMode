package com.alie.libdesignmodebehavior

import com.alie.libdesignmodebehavior.state.AlieBean
import com.alie.libdesignmodebehavior.state.AlieDailyWork
import com.alie.libdesignmodebehavior.state.HappyPersonalEmotion
import com.alie.libdesignmodebehavior.state.SadPersonalEmotion
import com.alie.libdesignmodebehavior.strategy.DualShock
import com.alie.libdesignmodebehavior.strategy.KeyBoard
import com.alie.libdesignmodebehavior.strategy.Player
import com.alie.libdesignmodebehavior.strategy.VrMachine


/**
 * 状态模式：哪一种状态都能做什么事情
 */
fun doTest01() {

    val dailyWork = AlieDailyWork()
    AlieBean().let {
//        it.mPersonalState = CommonBasePersonalEmotion(dailyWork)
//        it.mPersonalState = HappyPersonalEmotion(dailyWork)
        it.mPersonalState = SadPersonalEmotion(dailyWork)
        it.doDaily()
    }
}
fun doTest02() {
    Player().let {
//        it.mPlayBlackFlag = VrMachine()
//        it.mPlayBlackFlag = KeyBoard()
        it.mPlayBlackFlag = DualShock()
        it.doPlay()
    }
}
fun main(array: Array<String>) {
//    doTest01()//【状态模式】alie不同心情下的日常
    doTest02()//【策略模式】用不同的机器玩海战
}