class Notebook(
    override val weight: Int
) : Device() {
    override var screenCount: Int = 2
    override var color = "red"

    override fun turnOn() {
        println("Turning on.")
    }

    override fun turnOff() {
        println("Turning off.")
    }

    override fun device() {
        println("You should call turnOn() in advance.")
    }

    override fun unmount() {
        println("Mounting... (otherwise it will be broken.)")
    }
}