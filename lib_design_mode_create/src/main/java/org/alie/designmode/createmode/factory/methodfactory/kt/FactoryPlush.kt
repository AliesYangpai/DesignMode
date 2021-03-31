package org.alie.designmode.createmode.factory.methodfactory.kt

/**
 *  毛绒玩具工厂
 * 【一个工厂一个产品，有多少产品，就有多少子工厂实例】
 */
class FactoryPlush : IFactory<PlushToy> {
    override fun createToy(): PlushToy = PlushToy()
}