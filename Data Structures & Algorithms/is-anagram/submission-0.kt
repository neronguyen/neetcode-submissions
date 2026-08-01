class Solution {
    // Count all chars of first string by int array
    // Then decrease by chars of second string
    // Return if all element of int array = 0 
    // Pattern: Flag Array
    // Time: O(n), Space: O(1)
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val diffArr = IntArray(26)

        for (i in s) {
            val idx = i - 'a'
            diffArr[idx] = diffArr[idx] + 1
        }

        for (i in t) {
            val idx = i - 'a'
            diffArr[idx] = diffArr[idx] - 1
        }

        return diffArr.all { it == 0 }
    }
}
