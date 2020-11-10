package org.alie.designmode.structuralmode.proxy.commonproxy

class UserDaoImpl: IUserDao {
    override fun addUser(param: String) {
        println("====addUser $param")
    }

    override fun delUser(): Int {
        println("====delUser")
        return 0
    }

    override fun updateUer(param: String) {
        println("====updateUer $param")
    }

    override fun searchUser() {
        println("====searchUser")
    }
}