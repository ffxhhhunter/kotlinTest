import java.util.stream.Collectors

fun main() {
    println(findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val sortedArray = (nums1 + nums2).sorted()

    if (sortedArray.size % 2 == 0) {
        return (sortedArray.get((sortedArray.size / 2) - 1).toDouble() +
                sortedArray.get(sortedArray.size / 2).toDouble()) / 2
    } else {
        return sortedArray.get(((sortedArray.size / 2.0) - 0.5).toInt()).toDouble()
    }
}