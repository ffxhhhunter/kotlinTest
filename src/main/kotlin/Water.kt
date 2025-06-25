class Water(val volume: Double, val weight: Int) {
    var color: String = "white"
    var expiration = 0

    constructor(
        volume: Double,
        weight: Int,
        color: String
    ) : this(volume, weight) {
        this.color = color
    }

    constructor(
        volume: Double,
        weight: Int,
        expiration: Int
    ) : this(volume, weight) {
        this.expiration = expiration
    }

    init {
        println(volume)
    }

    init {
        println(expiration)
    }
}