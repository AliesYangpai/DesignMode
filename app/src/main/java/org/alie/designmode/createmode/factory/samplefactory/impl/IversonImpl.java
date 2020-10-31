package org.alie.designmode.createmode.factory.samplefactory.impl;

import android.util.Log;

import org.alie.designmode.MainActivity;
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
        Log.i(MainActivity.TAG,TAG + "==slamDunk");
    }

    @Override
    public void jumpShort() {
        Log.i(MainActivity.TAG,TAG + "==jumpShort");
    }

    @Override
    public void fadeAway() {
        Log.i(MainActivity.TAG,TAG + "==fadeAway");
    }

    @Override
    public void threePointer() {
        Log.i(MainActivity.TAG,TAG + "==threePointer");
    }
}
