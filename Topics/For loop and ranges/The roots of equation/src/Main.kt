import kotlin.math.pow

fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()
    val d: Int = readln().toInt()
    for (x in 0..1000) {
        val temp = a * x.toDouble().pow(3.0) + b * x.toDouble().pow (2.0) + c * x + d
        if (temp == 0.0) println(x)
    }
}