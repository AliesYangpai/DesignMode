package com.alie.libdesignmodecreate.createmode.factory.methodfactory.impl;


import com.alie.libdesignmodecreate.createmode.factory.methodfactory.ConnectDBBase;
import com.alie.libdesignmodecreate.createmode.factory.methodfactory.ConnectDBFactoryBase;

/**
 * Created by Alie on 2019/7/1.
 * 类描述
 * 版本
 */
public class JDBCConnectorFactory extends ConnectDBFactoryBase {

    private JDBCConnector jdbcConnector;

    public JDBCConnectorFactory() {
        super();
    }

    @Override
    protected ConnectDBBase getDBConnector() {
        jdbcConnector = new JDBCConnector();
        return jdbcConnector;
    }

    @Override
    public void doConnect() {
        jdbcConnector.connect();
    }

    @Override
    public void doOperate() {
        jdbcConnector.operate();
    }

    @Override
    public void doDisconnect() {
        jdbcConnector.disconnect();
    }
}
