class NewYorkCallingCentre(
    private val phoneNumber: Int,
    private val isSecure: Boolean,
    private val message: String
) : CallingCentre() {
    override fun callCustom() {
        println("Calling from New York to $phoneNumber, secure mode is: $isSecure.\nMessage is: $message")
    }
}