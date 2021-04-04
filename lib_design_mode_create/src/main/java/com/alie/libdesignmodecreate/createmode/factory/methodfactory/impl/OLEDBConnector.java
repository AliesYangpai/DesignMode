package com.alie.libdesignmodecreate.createmode.factory.methodfactory.impl;


import com.alie.libdesignmodecreate.createmode.factory.methodfactory.ConnectDBBase;

/**
 * Created by Alie on 2019/7/1.
 * 类描述
 * 版本
 */
public class OLEDBConnector implements ConnectDBBase {
    private static final String TAG = "OLEDBConnector";

    @Override
    public void connect() {
        System.out.println("===connect");
    }

    @Override
    public void operate() {
        System.out.println("===operate");
    }

    @Override
    public void disconnect() {
        System.out.println("===disconnect");
    }
}
