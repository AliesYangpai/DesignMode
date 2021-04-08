package com.alie.libdesignmodestructure.flyweight

class WeaponPool {
    var mMapWeapon = mapOf<String, IWeapon>("A" to SwordMode(), "B" to BowMode(), "C" to GunMode())

    fun getWeapon(key: String): IWeapon? = mMapWeapon[key]
}