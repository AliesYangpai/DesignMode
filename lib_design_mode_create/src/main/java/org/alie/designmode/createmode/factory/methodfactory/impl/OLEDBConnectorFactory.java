package org.alie.designmode.createmode.factory.methodfactory.impl;

import org.alie.designmode.createmode.factory.methodfactory.ConnectDBBase;
import org.alie.designmode.createmode.factory.methodfactory.ConnectDBFactoryBase;

/**
 * Created by Alie on 2019/7/1.
 * 类描述
 * 版本
 */
public class OLEDBConnectorFactory extends ConnectDBFactoryBase {
    private OLEDBConnector oledbConnector;


    public OLEDBConnectorFactory() {
        super();
    }

    @Override
    protected ConnectDBBase getDBConnector() {
        oledbConnector = new OLEDBConnector();
        return oledbConnector;
    }

    @Override
    public void doConnect() {

    }

    @Override
    public void doOperate() {

    }

    @Override
    public void doDisconnect() {

    }
}
