import java.util.stream.Collectors

fun main() {
    println(lengthOfLongestSubstring("asjrgapa"))
}

fun lengthOfLongestSubstring(s: String): Int {
    val charSet: MutableList<String> = mutableListOf()
    var previousCharSet = ""

    if (s.length <= 1) {
        return s.length
    }

    for (a in 0 until s.length) {
        var currentSubstring = ""
        for (b in a until s.length) {
            var currentChar = s.get(b)
            if (!currentSubstring.contains(currentChar)) {
                currentSubstring += currentChar
            } else {
                break
            }
        }
        charSet.add(currentSubstring)
    }

    if (charSet.isNotEmpty()) {
        for (set in charSet) {
            if (set.length > previousCharSet.length) {
                previousCharSet = set
            }
        }
    }

    return previousCharSet.length
}