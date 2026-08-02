import kotlin.collections.*

class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (c in s) {
            when (c) {
                '(', '{', '[' -> stack.add(c)
                ')' -> if (stack.removeLastOrNull() != '(') return false
                '}' -> if (stack.removeLastOrNull() != '{') return false
                else -> if (stack.removeLastOrNull() != '[') return false 
            }
        }

        return stack.isEmpty()
    }
}
