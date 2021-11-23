package com.alie.libdesignmodebehavior.observer.review1

class User(val name: String = "") {
    fun showInfo(updateItem: UpdateItem) {
        print("===$name")
        updateItem.show()
    }
}