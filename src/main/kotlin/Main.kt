fun main() {
    println(assemble("first", 49339))
}

fun assemble(data: String, payload: Int): String {
    var res = ""
    var str = (data.hashCode() * payload).toString()
    str.substring(1, str.length)
    val arr = str.split("")
    for (i in arr) {
        if (i == "" || i == " " || i == "-") {
            continue
        }
        res += i.toInt().toChar()
    }
    return res
}