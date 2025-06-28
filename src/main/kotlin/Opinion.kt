class Opinion(val importance: Int, val voters: Int) {
    lateinit var description: String
//        get() {
//            return field
//        }
//        set(description) {
//            field = description
//        }
    lateinit var image: Any
    var other: Boolean = false
        get() = field
        set(other) {
            field = other
        }
    var time: String? = null
        get() {
            return field
        }
        set(time) {
            field = time
        }
    var constant: Long = 100L
        get() {
            return field
        }
        set(constant) {
            field = constant
        }

    constructor(): this(0, 0)

    constructor(
        importance: Int,
        voters: Int,
        description: String
    ): this(importance, voters) {
        this.description = description
    }

    constructor(
        importance: Int,
        voters: Int,
        image: Any
    ) : this(importance, voters) {
        this.image = image
    }

    constructor(
        importance: Int,
        voters: Int,
        other: Boolean
    ): this(importance, voters) {
        this.other = other
    }

    constructor(
        importance: Int,
        voters: Int,
        time: String?
    ) : this(importance, voters) {
        this.time = time
    }
}