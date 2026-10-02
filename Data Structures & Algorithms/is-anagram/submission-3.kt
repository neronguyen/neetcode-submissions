class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val countArray = IntArray(26)
        for (i in s) {
            countArray[i - 'a'] += 1
        }
        for (i in t) {
            countArray[i - 'a'] -= 1
        }
        for (i in countArray) {
            if (i != 0) {
                return false
            }
        }
        return true
    }
}
