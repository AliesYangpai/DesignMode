package com.alie.libdesignmodebehavior.observer.part1java;

import java.util.Vector;

public class ZhangSan implements Borrower {
    private Vector<Lender> lenders = new Vector<>();
    @Override
    public void borrow(Lender lender) {
        lenders.add(lender);
    }

    @Override
    public void notifyLender() {
        lenders.forEach(Lender::takeMoney);
    }
}
