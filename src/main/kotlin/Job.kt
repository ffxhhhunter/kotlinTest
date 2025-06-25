class Job(val name: String) {
    var unique = false

    constructor(
        name: String,
        unique: Boolean
    ) : this(name) {
        this.unique = unique
    }

    init {
        println("Object $unique was created")
    }

    init {
        println("--- additional ---")
    }
}