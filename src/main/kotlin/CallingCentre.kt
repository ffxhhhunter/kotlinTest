open class CallingCentre {
    open fun callCustom() {
        println("Stock realization")
    }

    fun call(
        phoneNumber: Int,
        isSecure: Boolean
    ) {
        println("Calling $phoneNumber with secure mode $isSecure")
    }

    fun call(
        phoneNumber: Int,
        isSecure: Boolean,
        message: String
    ) {
        println("Calling $phoneNumber with secure mode $isSecure. Also message is: $message")
    }

    fun call(
        phoneNumber: Int,
        isSecure: Boolean,
        cost: Int
    ) {
        println("Calling $phoneNumber with secure mode $isSecure, which costs $$cost")
    }
}