class Unicode(
    length: Int,
    width: Int,
    code: String,
    val isTyping: Boolean
) : Plane(length, width, code = code) {

    fun hash() {
        println("Hashing is ${isTyping}")
    }
}