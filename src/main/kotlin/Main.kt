fun main() {
    multipleChoices(1, 10, 1939, 300)
}

fun multipleChoices(vararg choices: Int) {
    for (i in choices) {
        println("Choice: $i")
    }
}