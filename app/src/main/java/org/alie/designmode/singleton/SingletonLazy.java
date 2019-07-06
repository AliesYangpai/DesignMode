package org.alie.designmode.singleton;

/**
 * Created by Alie on 2019/7/6.
 * 懒汉式
 */
public class SingletonLazy {

    private static SingletonLazy mInstance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (null == mInstance) {
            mInstance = new SingletonLazy();
        }
        return mInstance;
    }
}
