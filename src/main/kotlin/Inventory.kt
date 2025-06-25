class Inventory(override val volume: Int) : Thing(1, "Name", 10) {
    override val description: String = ""

    override fun move() {
        println("Moving to $volume")
    }

    override fun powerOn() {
        println("Switching...")
    }

    override fun close() {
        println("Closing...")
    }

    override fun open() {
        println("Opening...")
    }

    override fun load() {
        println("Loading...")
    }

    override fun shutDown() {
        println("Shutting down...")
    }

    override fun exist() {
        println("Exist.")
    }

    override fun stop() {
        println("Stopping...")
    }

    override fun start() {
        println("Starting...")
    }

    override fun pause() {
        println("Pausing..")
    }
}