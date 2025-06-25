open class Rate(
    var id: Int,
    var name: String,
    val rate: Int = 10
) {
    fun quitRoom() {
        println("Exiting...")
    }
}