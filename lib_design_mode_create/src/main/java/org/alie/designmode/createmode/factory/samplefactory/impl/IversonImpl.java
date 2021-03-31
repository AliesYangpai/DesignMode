package org.alie.designmode.createmode.factory.samplefactory.impl;


import org.alie.designmode.createmode.factory.samplefactory.PlayerSkillsBase;

/**
 * Created by Alie on 2019/7/1.
 * 类描述
 * 版本
 */
public class IversonImpl implements PlayerSkillsBase {

    public static final String TAG = "IversonImpl";
    @Override
    public void slamDunk() {
        System.out.println("===slamDunk");
    }

    @Override
    public void jumpShort() {
        System.out.println("===jumpShort");
    }

    @Override
    public void fadeAway() {
        System.out.println("===fadeAway");
    }

    @Override
    public void threePointer() {
        System.out.println("===threePointer");
    }
}
