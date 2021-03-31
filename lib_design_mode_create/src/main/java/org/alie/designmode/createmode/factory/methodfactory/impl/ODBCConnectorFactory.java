package org.alie.designmode.createmode.factory.methodfactory.impl;

import org.alie.designmode.createmode.factory.methodfactory.ConnectDBBase;
import org.alie.designmode.createmode.factory.methodfactory.ConnectDBFactoryBase;

/**
 * Created by Alie on 2019/7/1.
 * 类描述
 * 版本
 */
public class ODBCConnectorFactory extends ConnectDBFactoryBase {
    private ODBCConnector odbcConnector;

    public ODBCConnectorFactory() {
        super();
    }

    @Override
    protected ConnectDBBase getDBConnector() {
        odbcConnector = new ODBCConnector();
        return odbcConnector;
    }

    @Override
    public void doConnect() {
        odbcConnector.connect();
    }

    @Override
    public void doOperate() {
        odbcConnector.operate();
    }

    @Override
    public void doDisconnect() {
        odbcConnector.disconnect();
    }
}
