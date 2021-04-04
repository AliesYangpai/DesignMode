package com.alie.libdesignmodecreate.createmode.singleton;

/**
 * Created by Alie on 2019/7/6.
 * 单锁双空验证 一般情况下使用这种即可
 * volatile :1.多线程访问的时候保证数据可见性（原理：迅速将数据从线程工作内存中刷回主存，来保证数据）
 *           2.java编译的过程中防止指令重排
 * 版本
 */
public class SingleTonDoubleCheck {
    private volatile static SingleTonDoubleCheck mInstance;

    private SingleTonDoubleCheck() {
    }

    public static SingleTonDoubleCheck getInstance() {
        if (null == mInstance) {
            synchronized (SingleTonDoubleCheck.class) {
                if (null == mInstance) {
                    mInstance = new SingleTonDoubleCheck();
                }
            }
        }
        return mInstance;
    }
}
