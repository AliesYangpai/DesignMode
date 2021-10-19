package com.alie.libdesignmodecreate.createmode.prototype.review1

class Phone(val name: String, val brand: String, val price: Float) : Cloneable {
    public override fun clone(): Phone {
        return super.clone() as Phone
    }
}