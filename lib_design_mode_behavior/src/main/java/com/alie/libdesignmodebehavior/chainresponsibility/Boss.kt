package com.alie.libdesignmodebehavior.chainresponsibility

class Boss : LeaveHandler<LeavingReqBean>() {
    override fun dealEvent(t: LeavingReqBean?): String? {
        return "Boss agree"
    }

}