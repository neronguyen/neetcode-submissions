class MinStack() {
    val stack = ArrayDeque<Int>()
    val minStack = ArrayDeque<Int>()
    var minNum = Int.MAX_VALUE

    fun push(`val`: Int) {
        stack.add(`val`)
        minNum = minOf(minNum, `val`)
        minStack.add(minNum)
    }

    fun pop() {
        stack.removeLast()
        minStack.removeLast()
        minNum = minStack.lastOrNull() ?: Int.MAX_VALUE
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}
