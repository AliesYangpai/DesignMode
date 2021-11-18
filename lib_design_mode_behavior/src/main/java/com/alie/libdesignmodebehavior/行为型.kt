package com.alie.libdesignmodebehavior

import com.alie.libdesignmodebehavior.chainresponsibility.*
import com.alie.libdesignmodebehavior.state.AlieBean
import com.alie.libdesignmodebehavior.state.AlieDailyWork
import com.alie.libdesignmodebehavior.state.HappyPersonalEmotion
import com.alie.libdesignmodebehavior.state.SadPersonalEmotion
import com.alie.libdesignmodebehavior.strategy.DualShock
import com.alie.libdesignmodebehavior.strategy.KeyBoard
import com.alie.libdesignmodebehavior.strategy.Player
import com.alie.libdesignmodebehavior.strategy.VrMachine
import com.alie.libdesignmodebehavior.strategy.review1.*


/**
 * 【状态模式】alie不同心情下的日常
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

/**
 * 【策略模式】用不同的机器玩海战
 */
fun doTest02() {
    Player().let {
//        it.mPlayBlackFlag = VrMachine()
//        it.mPlayBlackFlag = KeyBoard()
        it.mPlayBlackFlag = DualShock()
        it.doPlay()
    }
}

/**
 * 【责任链模式】alie请假流程
 */
fun doTest03() {
    var handler3 = Boss()
    var handler2 = Manager()
    var handler1 = Leader()

    handler2.setHandlerManager(handler3)
    handler1.setHandlerManager(handler2)
    var ret = handler1.dealEvent(LeavingReqBean("我要请假",12))
    println("===反馈结果:$ret")
}

/**
 * 【策略模式】洗衣机的清洗和甩干
 */
fun doTest04() {
    WashManger.INSTANCE.wash(FastWash())
    WashManger.INSTANCE.spinDry(FastDry())
    WashManger.INSTANCE.wash(StanderWash())
    WashManger.INSTANCE.spinDry(StanderDry())
}

fun main(array: Array<String>) {
//    doTest01()//【状态模式】alie不同心情下的日常
//    doTest02()//【策略模式】alie用不同的机器玩海战
//    doTest03()//【责任链模式】alie请假流程
    doTest04()//【策略模式】洗衣机的清晰模式
}