class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = strs[0]

        for (i in 1 until strs.size) {
            val cPrefix = getCommonPrefix(prefix, strs[i])
            if (cPrefix == "") return ""

            prefix = cPrefix
        }

        return prefix
    }

    fun getCommonPrefix(a: String, b: String): String {
        var i = 0
        while (i < a.length && i < b.length && a[i] == b[i]) {
            i++
        }

        return a.take(i)
    }
}
