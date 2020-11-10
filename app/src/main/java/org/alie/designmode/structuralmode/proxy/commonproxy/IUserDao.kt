package org.alie.designmode.structuralmode.proxy.commonproxy

interface IUserDao {
    fun addUser(param:String)
    fun delUser():Int
    fun updateUer(param: String)
    fun searchUser()
}