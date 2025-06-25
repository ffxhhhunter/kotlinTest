private val x = 100

private fun shutDown() {
    println("Shutting down...")
}

class Runner {
    private var num = 10
    var isLoading = false
//        get() = true
        set(newVal) {
            field = true
        }

    fun open() {
        println("Open")
    }

    fun getNum(): Int {
        return num
    }

    fun setNum(num: Int) {
        this.num = num
    }

    fun getNum(y: String) = num
}

class Surgery {
    fun first() {
        println(x)
        shutDown()
        println(Runner::class.simpleName)
    }
}