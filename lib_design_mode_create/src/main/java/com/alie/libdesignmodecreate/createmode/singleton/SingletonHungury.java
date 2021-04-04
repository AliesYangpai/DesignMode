package com.alie.libdesignmodecreate.createmode.singleton;

/**
 * Created by Alie on 2019/7/6.
 * 饿汉式 缺点：
 * 1.实例化的时候无法传参
 * 2.线程不安全
 * 版本
 */
public class SingletonHungury {
    private static SingletonHungury mInstance = new SingletonHungury();
    public static SingletonHungury getInstance() {
        return mInstance;
    }
    // 构造方法私有化的目的主要是为了避免 外部直接new对象
    private SingletonHungury() {
    }
}
