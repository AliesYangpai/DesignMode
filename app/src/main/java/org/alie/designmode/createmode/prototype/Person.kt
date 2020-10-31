package org.alie.designmode.createmode.prototype

/**
 * 原型模式，直接从内存中操作二进制流，比new的过程要快很多，
 * 因为new 的过程需要父类构造递归，当前类的构造代码再执行
 */
class Person(var name: String = "", var age: Short = 0, var list: ArrayList<String>? = null) : Cloneable {


    public override fun clone(): Person {
        return super.clone() as Person
    }
}