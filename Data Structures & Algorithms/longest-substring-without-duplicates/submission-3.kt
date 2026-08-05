class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val n = s.length
        val set = mutableSetOf<Char>()
        var i = 0
        var max = 0

        for (j in 0..<n) {
            while(s[j] in set) {
                set.remove(s[i])
                i++
            }

            set.add(s[j]) 
            max = maxOf(max, set.size)
        }

        return max
    }
}
