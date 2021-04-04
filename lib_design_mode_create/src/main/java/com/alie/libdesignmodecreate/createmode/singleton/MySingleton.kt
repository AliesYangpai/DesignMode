package org.alie.designmode.createmode.singleton


class MySingleton {
    companion object {
        @Volatile
        private var mInstance: MySingleton? = null
        fun getInstance(): MySingleton {
            return mInstance ?: synchronized(this) {
                mInstance ?: MySingleton().also {
                    mInstance = it
                }
            }
        }
    }

    fun playMusic() = println("===play musice")
}