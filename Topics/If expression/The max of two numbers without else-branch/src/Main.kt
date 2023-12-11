fun main() {

    val numberOne = readln().toInt()
    val numberTwo = readln().toInt()
    var maxNumber = numberOne
    if (maxNumber < numberTwo) {
        maxNumber = numberTwo
    }

    println(maxNumber)
}