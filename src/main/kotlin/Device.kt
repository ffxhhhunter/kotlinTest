abstract class Device : Devicable {
    abstract var screenCount: Int
    abstract var color: String
    abstract val weight: Int

    abstract fun turnOn()
    abstract fun turnOff()
}