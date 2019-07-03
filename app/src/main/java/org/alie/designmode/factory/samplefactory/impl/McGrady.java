package org.alie.designmode.factory.samplefactory.impl;

import android.util.Log;

import org.alie.designmode.MainActivity;
import org.alie.designmode.factory.samplefactory.PlayerSkillsBase;

/**
 * Created by Alie on 2019/7/1.
 * 类描述
 * 版本
 */
public class McGrady implements PlayerSkillsBase {
    public static final String TAG = "McGrady";
    @Override
    public void slamDunk() {
        Log.i(MainActivity.TAG, TAG + "==slamDunk");
    }

    @Override
    public void jumpShort() {
        Log.i(MainActivity.TAG, TAG + "==jumpShort");
    }

    @Override
    public void fadeAway() {
        Log.i(MainActivity.TAG, TAG + "==fadeAway");
    }

    @Override
    public void threePointer() {
        Log.i(MainActivity.TAG, TAG + "==threePointer");
    }
}
