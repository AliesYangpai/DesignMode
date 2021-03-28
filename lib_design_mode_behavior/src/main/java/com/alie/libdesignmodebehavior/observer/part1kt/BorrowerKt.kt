package com.alie.libdesignmodebehavior.observer.part1kt

interface BorrowerKt {
  fun borrow(lenderKt: LenderKt)
  fun notifyLender();
}