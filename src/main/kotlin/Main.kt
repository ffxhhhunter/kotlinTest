fun main() {
    val products = listOf("parcel", "window", "door")
    val indexes = mutableListOf(1, 10, 93, 73, 27)

    for (item in products) {
        println("Product: $item")
    }

    var index = 0
    while (index < products.size) {
        println("Product ${products[index]} has index $index")
        index++
    }

    println(90 in 100..823)

    for (i in 900 downTo 9 step 9) {
        println(i)
    }

    for (i in 100 until 150) {
        println(i)
    }
}