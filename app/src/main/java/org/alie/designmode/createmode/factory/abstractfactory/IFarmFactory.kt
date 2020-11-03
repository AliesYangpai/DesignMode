package org.alie.designmode.createmode.factory.abstractfactory

interface IFarmFactory {
    fun <T : Animal> createAnimal(): T
    fun <R : Plant> createPlant(): R
    fun <V : Tool> createTool(): V
}