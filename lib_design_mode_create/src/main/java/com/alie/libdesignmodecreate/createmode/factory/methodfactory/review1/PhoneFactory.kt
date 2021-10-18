package com.alie.libdesignmodecreate.createmode.factory.methodfactory.review1



interface PhoneFactory<T : BasePhone> {
    fun create(): T
}

object SmartPhoneFactory : PhoneFactory<SmartPhone> {
    override fun create(): SmartPhone = SmartPhone()
}

object OldPhoneFactory : PhoneFactory<OldPhone> {
    override fun create(): OldPhone = OldPhone()
}

object SpecialPhoneFactory : PhoneFactory<SmartPhone> {
    override fun create(): SmartPhone = SmartPhone()

}