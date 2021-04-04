package com.alie.libdesignmodecreate.createmode.singleton;

/**
 * Created by Alie on 2019/7/6.
 * 内部类创建法：
 * 静态内部类的静态属性实例化的时候，jvm内部会自行控制线程安全；此方法与单锁双空发效果一直
 * 版本
 */
public class SingleInnerClass {

    private SingleInnerClass() {
    }

    private static class SingleInnerClassViewHolder {
        private static SingleInnerClass mInstance = new SingleInnerClass();
    }

    public static SingleInnerClass getInstance() {
        return SingleInnerClassViewHolder.mInstance;
    }
}
