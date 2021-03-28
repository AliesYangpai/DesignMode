package com.alie.libdesignmodebehavior.observer.part1kt

import java.util.*

class ZhangXiaoSan:BorrowerKt {
   private var mVector:Vector<LenderKt> = Vector<LenderKt>()


    override fun borrow(lenderKt: LenderKt) {
        mVector.add(lenderKt)
    }

    override fun notifyLender() {
       mVector.forEach { it.takeMoney() }
    }
}