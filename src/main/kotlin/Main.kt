fun main() {
    multipleChoices(1, 10, 1939, 300)
    multipleChoices(*intArrayOf(90, 19, 30), 9, 2, 2)
}

fun multipleChoices(vararg choices: Int) {
    for (i in choices) {
        println("Choice: $i")
    }
}