package org.alie.designmode

import org.alie.designmode.createmode.prototype.Person
import org.alie.designmode.createmode.prototype.Student
import org.alie.designmode.createmode.singleton.MySingleton

fun main(array: Array<String>) {
//    testSingleton()
//    testProtoType1()
    testProtoType2()
}


/**
 * 单例
 */
fun testSingleton() {
    MySingleton.getInstance().playMusic()
}

/**
 * 原型模式
 * 此案例可以看出浅拷贝的特征
 */
fun testProtoType1() {
    var student = Student()
    student.name = "tom"
    student.age = 12
    student.gender = "male"


    val list = ArrayList<String>()
    list.add("A")
    list.add("B")

    student.stringList = list
    val studentClone = student.clone()
    println(" 更改前： student name:${student.name},student age:${student.age},list:${list[0]}" +
            "studentClone name:${studentClone.name} studentClone age:${studentClone.age},list:${list[0]}")

    student.name = "Jerry"
    student.age = 15
    student.stringList[0] = "a"
    println(" 更改后： student name:${student.name},student age:${student.age},list:${list[0]}" +
            "studentClone name:${studentClone.name} studentClone age:${studentClone.age},list:${list[0]}")


}

/**
 * 原型模式
 * 此案例可以看出浅拷贝的特征
 */
fun testProtoType2() {
    val person by lazy {
        Person("Tom", 10, mutableListOf<String>("A", "B", "C") as ArrayList<String>)
    }

    val personClone = person.clone()
    println(" 更改前： person name:${person.name},person age:${person.age},list:${person.list?.get(0)}" +
            "personClone name:${personClone.name} personClone age:${personClone.age},list:${personClone.list?.get(0)}")

    person.name = "Jerry"
    person.age = 15
    person.list?.set(0, "a")

    println(" 更改前： person name:${person.name},person age:${person.age},list:${person.list?.get(0)}" +
            "personClone name:${personClone.name} personClone age:${personClone.age},list:${personClone.list?.get(0)}")


}