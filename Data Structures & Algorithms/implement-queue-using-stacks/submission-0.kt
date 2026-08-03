class MyQueue() {
    
    val queue = ArrayDeque<Int>()

    fun push(x: Int) {
        queue.add(x)
    }   

    fun pop(): Int {
        return queue.removeFirst()
    }

    fun peek(): Int {
        return queue.first()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * val obj = MyQueue()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.peek()
 * val param_4 = obj.empty()
 */
