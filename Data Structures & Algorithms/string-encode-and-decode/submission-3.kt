class Solution {

    fun encode(strs: List<String>): String {
        val builder = StringBuilder()
        for (str in strs) {
            with (builder) {
                append(str.length)
                append(DELIMITER)
                append(str)
            }
        }

        return builder.toString()
    }

    fun decode(str: String): List<String> {
        val list = mutableListOf<String>()
        var idx = 0
        var countStartIdx = 0

        while (idx < str.length) {
            if (str[idx] == DELIMITER) {
                val length = str.substring(countStartIdx, idx).toInt()
                list.add(str.substring(idx + 1, idx + 1 + length))
                countStartIdx = idx + 1 + length
                idx += 1 + length
            } else {
                idx++
            }
        }

        return list
    }

    companion object {
        private const val DELIMITER = '#'
    }
}
