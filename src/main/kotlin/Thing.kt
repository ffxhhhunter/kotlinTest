abstract class Thing(
    id: Int,
    name: String,
    rate: Int
) : Loadable, Openable, Rate(id, name, rate) {
    abstract val description: String
    abstract val volume: Int

    abstract fun move()
    abstract fun powerOn()
}