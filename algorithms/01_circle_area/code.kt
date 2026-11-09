import kotlin.math.PI

fun circleArea(r: Double):Double {
    val area = Pi * r * r
    return r
}

fun main() {
    println(circleArea(5.0))
    println(circleArea(10.0))
    println(circleArea(15.0))
}