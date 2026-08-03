class Solution {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.lastIndex

        while (i <= j) {
            if (!s[i].isLetterOrDigit()) {
                i++
                continue
            }

            if (!s[j].isLetterOrDigit()) {
                j--
                continue
            }

            if (!s[i].equals(s[j], true)) {
                return false
            }

            i++
            j--
        }

        return true
    }
}
