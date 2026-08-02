class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = mutableListOf<Int>()
        for (i in operations) {
            when (i) {
                "+" -> stack.add(stack.last() + stack[stack.lastIndex - 1])
                "C" -> stack.removeLast()
                "D" -> stack.add(stack.last() * 2)
                else -> stack.add(i.toInt())
            }
        }

        return stack.sum()
    }
}
