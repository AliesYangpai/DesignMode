package org.alie.designmode.factory.methodfactory;

/**
 * Created by Alie on 2019/7/1.
 * 类描述
 * 版本
 */
public interface ConnectDBBase {
    void connect(); // 连接数据库

    void operate();  // 操作数据库

    void disconnect(); // 断开数据库
}
