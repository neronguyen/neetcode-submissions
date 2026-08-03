class Solution {
    fun validPalindrome(s: String): Boolean {
        val s2 = s.filter { it.isLetterOrDigit() }
        var i = 0
        var j = s2.lastIndex

        while (i < j) {
            if (!s2[i].equals(s2[j], true)) {
                return isValid(i + 1, j, s2) || isValid(i, j - 1, s2)
            }

            i++
            j--
        }

        return true
    }

    fun isValid(from: Int, to: Int, s: String): Boolean {
        var front = from
        var back = to

        while (front < back) {
            if (!s[front].equals(s[back], true)) {
                return false
            }

            front++
            back--
        }

        return true
    }
}
