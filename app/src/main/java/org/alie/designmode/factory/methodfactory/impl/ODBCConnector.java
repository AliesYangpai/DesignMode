package org.alie.designmode.factory.methodfactory.impl;

import android.util.Log;

import org.alie.designmode.MainActivity;
import org.alie.designmode.factory.methodfactory.ConnectDBBase;

/**
 * Created by Alie on 2019/7/1.
 * 类描述
 * 版本
 */
public class ODBCConnector implements ConnectDBBase {
    private static final String TAG = "ODBCConnector";

    @Override
    public void connect() {
        Log.i(MainActivity.TAG, TAG + "====connect");
    }

    @Override
    public void operate() {
        Log.i(MainActivity.TAG, TAG + "====operate");
    }

    @Override
    public void disconnect() {
        Log.i(MainActivity.TAG, TAG + "====disconnect");
    }
}
