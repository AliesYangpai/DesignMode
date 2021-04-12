package com.alie.libdesignmodebehavior.chainresponsibility

class Manager:LeaveHandler<LeavingReqBean>() {
    override fun dealEvent(t: LeavingReqBean?): String? {
        return when(t!!.dayCount) {
            in 4 ..7-> "Manager agree"
            else -> mNextLeaveHandler?.dealEvent(t)
        }
    }

}