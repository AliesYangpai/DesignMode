package com.alie.libdesignmodebehavior.observer.review1



interface NotifyFeature<T,V> {
    fun register(t:T)
    fun remove(t:T):Boolean
    fun notifyAllMember(v:V)
}

class GamePlatformMgr:NotifyFeature<User,UpdateItem> {
    companion object {
        val instance by lazy { GamePlatformMgr() }
    }

    private val setCollection = mutableSetOf<User>()
    override fun register(t: User) {
        setCollection.add(t)
    }
    override fun remove(t: User) = try {
        setCollection.remove(t)
    }catch (e:Exception) {
        false
    }
    override fun notifyAllMember(v: UpdateItem) {
        setCollection.forEach {
            it.showInfo(v)
        }
    }

}
