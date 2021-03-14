package org.alie.designmode.structuralmode.proxy.commonproxy

/**
 * mvp中P层中调用m的方法就是一种代理
 */
class UserDaoProxy(var iUserDao: IUserDao) : IUserDaoProxy {


    override fun addUser(param: String) {
        println("===Proxy中预处理一下，比如渗点钱")
        iUserDao.addUser(param)
    }

    override fun delUser(): Int = iUserDao.delUser()

    override fun updateUer(param: String) = iUserDao.updateUer("proxy")

    override fun searchUser() = iUserDao.searchUser()
}