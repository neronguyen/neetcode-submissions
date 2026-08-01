class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val countArr = IntArray(26)

            for (c in str) {
                val idx = c - 'a'
                countArr[idx]++
            }

            val keyBuilder = StringBuilder()
            for ((index, count) in countArr.withIndex()) {
                if (count >= 1) {
                    keyBuilder.append("$index$count#")
                }
            } 

            val key = keyBuilder.toString()
            if (map[key] == null) map[key] = mutableListOf(str)
            else map[key]?.add(str)
        }

        return map.values.toList()
    }
}
