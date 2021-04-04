import com.alie.libdesignmodebehavior.adapter.CarToy

fun main(array: Array<String>) {
    doTest01()
}

fun doTest01() {
    var carToy = CarToy("越野遥控赛车")
    carToy.mVoltage = 0F
    carToy.doPlay()
}