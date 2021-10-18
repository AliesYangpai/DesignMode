package com.alie.libdesignmodecreate.createmode.factory.abstractfactory

import org.alie.designmode.createmode.factory.abstractfactory.IFarmFactory
import org.alie.designmode.createmode.factory.abstractfactory.bean.Cow
import org.alie.designmode.createmode.factory.abstractfactory.bean.Pumpkin
import org.alie.designmode.createmode.factory.abstractfactory.bean.Sickle

class YangPaiFarm : IFarmFactory<Cow, Pumpkin, Sickle> {
    override fun createAnimal(): Cow = Cow()

    override fun createPlant(): Pumpkin = Pumpkin()

    override fun createTool(): Sickle = Sickle()
}