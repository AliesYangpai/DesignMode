package com.alie.libdesignmodebehavior.observer.part1java;


import com.alie.libdesignmodebehavior.observer.part1java.RichMan1;
import com.alie.libdesignmodebehavior.observer.part1java.RichMan2;
import com.alie.libdesignmodebehavior.observer.part1java.RichMan3;
import com.alie.libdesignmodebehavior.observer.part1java.ZhangSan;

public class HolderJava {
    public static void main(String[] args) {
        System.out.println("张三开始借钱。。。");
        ZhangSan zhangSan = new ZhangSan();
        RichMan1 richMan1 = new RichMan1();
        RichMan2 richMan2 = new RichMan2();
        RichMan3 richMan3 = new RichMan3();
        zhangSan.borrow(richMan1);
        zhangSan.borrow(richMan2);
        zhangSan.borrow(richMan3);

        try {
            Thread.sleep(3000);
            System.out.println("3s 之后，张三有钱了，开始还钱。。。");
            zhangSan.notifyLender();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
