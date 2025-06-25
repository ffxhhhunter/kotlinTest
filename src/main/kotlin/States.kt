enum class States(val id: Int) {
    LOGGING_IN(4) {
        override fun decrypted() {
            println("It isn't a joke")
        }
    },
    LOGGED_IN(3) {
        override fun decrypted() {
            println("Color")
        }
    },
    SIGNING_UP(2) {
        override fun decrypted() {
            println("Some")
        }
    },
    SIGNED_UP(1) {
        override fun decrypted() {
            println("Summary")
        }
    };

    abstract fun decrypted()
}