package org.alie.designmode.createmode.factory.methodfactory.kt

//class ToyFactory:IFactory {
//    override fun createToy(): Toy = CarToy()
//}
/**
 *  玩具车工厂
 * 【一个工厂一个产品，有多少产品，就有多少子工厂实例】
 */
class FactoryCar:IFactory<CarToy>{
    override fun createToy(): CarToy = CarToy()
}