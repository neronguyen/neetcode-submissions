class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val n = s.length
        val map = mutableMapOf<Char, Int>()
        var i = 0
        var max = 0

        for (j in 0..<n) {
            while(s[j] in map) {
                map.remove(s[i])
                i++
            }

            map[s[j]] = j
            max = maxOf(max, map.count())
        }

        return max
    }
}
