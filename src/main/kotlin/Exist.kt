class Exist(
    length: Int,
    width: Int,
    val name: String
) : Plane(length, width) {

    fun openDoor() {
        println("Opening door in ${name}...")
    }

    override fun modeOn() {
        super.modeOn()
        println("Mode is on in $name")
    }
}