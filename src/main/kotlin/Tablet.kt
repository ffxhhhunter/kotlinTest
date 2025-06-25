class Tablet(
    override var color: String
) : Device() {
    override var screenCount: Int = 10
    override val weight: Int = 100

    override fun turnOn() {
        println("On.")
    }

    override fun turnOff() {
        println("Off.")
    }

    override fun device() {
        println("It is being devicing...")
    }

    override fun unmount() {
        println("Unmount can't be used here.")
    }
}