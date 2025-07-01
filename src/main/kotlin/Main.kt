import java.util.stream.Collectors

fun main() {
    println(solution(listOf("eat", "tba", "ate", "tan", "tea", "nat", "bat")))
}

fun solution(input: List<String>): List<List<String>> {
    val res: MutableList<MutableList<String>> = mutableListOf()

    for (str in input) {
        if (res.isEmpty()) {
            res.add(mutableListOf(str))
            continue
        }

        val chars: MutableList<String> = mutableListOf()
        for (char in str.substring(0)) {
            chars.add("$char")
        }

        for (e in res) {
            var coincidence = 0
            for (char in e.get(0)) {
                if (chars.contains("$char")) {
                    coincidence++
                }
            }
            if (coincidence == chars.size && coincidence == e.get(0).length) {
                e.add(str)
            }
        }

        var isAdded = false
        for (a in res) {
            for (b in a) {
                if (b == str) {
                    isAdded = true
                }
            }
        }
        if (!isAdded) {
            res.add(mutableListOf(str))
        }
    }

    return res
}