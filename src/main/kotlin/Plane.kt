abstract class Plane(
    val length: Int,
    val width: Int,
    val code: String = "sha256"
) {
    fun switchToDrive() {
        println("Switching to drive,,,")
    }

    open fun modeOn() {
        println("Mode is on.")
    }
}