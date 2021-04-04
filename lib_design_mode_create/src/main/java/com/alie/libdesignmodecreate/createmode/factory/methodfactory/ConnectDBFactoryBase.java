package com.alie.libdesignmodecreate.createmode.factory.methodfactory;

/**
 * Created by Alie on 2019/7/1.
 * 类描述
 * 版本
 */
public abstract class ConnectDBFactoryBase {


    public ConnectDBFactoryBase() {
        getDBConnector();
    }

    protected abstract ConnectDBBase getDBConnector();

    public abstract void doConnect();

    public abstract void doOperate();

    public abstract void doDisconnect();
}
