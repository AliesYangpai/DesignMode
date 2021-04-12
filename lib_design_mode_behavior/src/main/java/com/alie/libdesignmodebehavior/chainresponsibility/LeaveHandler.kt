package com.alie.libdesignmodebehavior.chainresponsibility

/**
 * 请假流程处理类
 */
abstract class LeaveHandler<T> {
    protected var mNextLeaveHandler:LeaveHandler<T>? = null

    fun setHandlerManager(nextLeaveHandler: LeaveHandler<T>?) {
        mNextLeaveHandler = nextLeaveHandler
    }

    abstract fun dealEvent(t:T?):String?
}