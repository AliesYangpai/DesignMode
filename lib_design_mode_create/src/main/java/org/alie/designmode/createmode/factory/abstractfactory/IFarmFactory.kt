package org.alie.designmode.createmode.factory.abstractfactory

interface IFarmFactory<T : Animal, R : Plant, V : Tool> {
    fun createAnimal(): T
    fun createPlant(): R
    fun createTool(): V
}