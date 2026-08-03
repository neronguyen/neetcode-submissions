class Solution {
    fun validPalindrome(s: String): Boolean {
        var i = 0
        var j = s.lastIndex

        while (i < j) {
            if (!s[i].equals(s[j], true)) {
                return isValid(i + 1, j, s) || isValid(i, j - 1, s)
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
