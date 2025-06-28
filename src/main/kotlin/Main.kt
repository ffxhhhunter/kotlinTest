fun main() {
    val list = listOf(1, 100, 90, 93)
    list.forEach {e -> println(e)}
    list.map {e -> e.toString().plus("other")}
    list.reduce {acc, e -> acc + e}
    list.any {e -> e > 10} //finds any element which satisfies this condition
    list.filter {e -> e >= 10}
    list.sortedByDescending { it }
    list.all {e -> e != 0} //every element must satisfy this condition
    list.sum() //sums all the element in this list

    val another = listOf(10, 30, 9, 92, 93)
    val (more, less) = another.partition {e -> e > 10} //divides this list into two parts with selected condition

    val parts = another.groupBy {e -> e} //creates a HashMap/LinkedHashMap: keys=values of elements, values=elements
    println(parts.keys)
    println(parts.values)
    println(parts.get(2))
}

fun switch(input: Any) {
    when (input) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        is String -> println("String")
        is Boolean -> println("Boolean")
        in 200 until 3040 -> println("Range")
        else -> println("Else")
    }
}