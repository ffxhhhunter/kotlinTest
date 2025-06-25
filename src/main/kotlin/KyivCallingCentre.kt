class KyivCallingCentre(
    private val phoneNumber: Int,
    private val isSecure: Boolean,
    private val cost: Int
) : CallingCentre() {
    override fun callCustom() {
        println("Calling from Kyiv to $phoneNumber, secure mode is: $isSecure.\nCost per call is: $cost")
    }
}