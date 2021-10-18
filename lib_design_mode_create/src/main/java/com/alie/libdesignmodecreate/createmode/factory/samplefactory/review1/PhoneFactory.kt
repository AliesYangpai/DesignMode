package com.alie.libdesignmodecreate.createmode.factory.samplefactory.review1


const val TAG_SMART_PHONE: Short = 1
const val TAG_OLD_PHONE: Short = 2
const val TAG_SPECIAL_PHONE: Short = 3

object PhoneFactory {
    @Synchronized
    fun create(tag: Short): BasePhone = when (tag) {
        TAG_SMART_PHONE -> SmartPhone()
        TAG_OLD_PHONE -> OldPhone()
        else -> SpecialPhone()
    }
}