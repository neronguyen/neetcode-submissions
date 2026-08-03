class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        return buildString {
            repeat(maxOf(word1.length, word2.length)) { i -> 
                word1.getOrNull(i)?.let(::append)
                word2.getOrNull(i)?.let(::append)
            }
        }
    }
}
