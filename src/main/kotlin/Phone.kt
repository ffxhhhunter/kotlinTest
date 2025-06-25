class Phone(
    override var screenCount: Int,
    val osName: String
) : Device() {
    override var color: String = "black"
    override val weight: Int = 200

    override fun turnOn() {
        println("Turning on...")
    }

    override fun turnOff() {
        println("Turning off...")
    }

    override fun device() {
        println("Devicing...")
    }

    override fun unmount() {
        println("You can't unmount it.")
    }
}