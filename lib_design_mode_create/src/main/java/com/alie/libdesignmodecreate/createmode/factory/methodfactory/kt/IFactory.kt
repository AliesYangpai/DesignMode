package org.alie.designmode.createmode.factory.methodfactory.kt


/**
 * 这只是个简单的例子，当然了 咱们完全可以在这里操作一波泛型比如后面那个
 */
//interface IFactory {
//    fun createToy(): Toy
//}

/**
 * 【一个工厂一个产品，有多少产品，就有多少子工厂实例】
 */
interface IFactory<T : Toy> {
    fun createToy(): T
}