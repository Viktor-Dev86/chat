fun main() {
    val students = readln().toInt()
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    var d: Int = 0
    repeat(students) {
        val grades = readln().toInt()
        when (grades) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    println("$d $c $b $a")
}