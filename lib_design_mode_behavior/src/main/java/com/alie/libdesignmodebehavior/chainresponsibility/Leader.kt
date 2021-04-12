package com.alie.libdesignmodebehavior.chainresponsibility

class Leader : LeaveHandler<LeavingReqBean>() {
    override fun dealEvent(t: LeavingReqBean?): String? {
        return when (t!!.dayCount) {
            in 0..3 -> " Leader agree"
            else -> mNextLeaveHandler?.dealEvent(t)
        }
    }

}