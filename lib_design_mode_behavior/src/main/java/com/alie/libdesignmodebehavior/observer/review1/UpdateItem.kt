package com.alie.libdesignmodebehavior.observer.review1

interface UpdateItem {
    fun show()
}

class BlackFriday:UpdateItem{
    override fun show() {
        println("===BlackFriday show")
    }
}


class Halloween:UpdateItem{
    override fun show() {
        println("===Halloween show")
    }
}

class Christmas:UpdateItem{
    override fun show() {
        println("===Christmas show")
    }
}