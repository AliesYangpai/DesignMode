package org.alie.designmode

import org.alie.designmode.structuralmode.proxy.commonproxy.UserDaoImpl
import org.alie.designmode.structuralmode.proxy.commonproxy.UserDaoProxy
import org.alie.designmode.structuralmode.proxy.dynamicproxy.CarDaoImpl
import org.alie.designmode.structuralmode.proxy.dynamicproxy.CarProxy
import org.alie.designmode.structuralmode.proxy.dynamicproxy.ICarDao

fun main(array: Array<String>) {
//    testProxyCommon()
    testProxyDynamic()
}

/**
 * 测试普通代理
 */
fun testProxyCommon() {
    val userDaoProxy = UserDaoProxy(UserDaoImpl())
    userDaoProxy.addUser("Xxx")
}

/**
 * 动态代理
 */
fun testProxyDynamic() {
    val carProxy = CarProxy(CarDaoImpl())
    val proxy = carProxy.proxyInstance as ICarDao
    proxy.addCar("你好")
    proxy.delCar()
}