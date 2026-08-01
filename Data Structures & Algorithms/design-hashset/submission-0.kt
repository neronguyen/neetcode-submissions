class MyHashSet() {

    private val BUCKET_SIZE = 1_000_001
    private val set = IntArray(BUCKET_SIZE) { -1 }

    fun add(key: Int) {
        set[getIdx(key)] = key
    }

    fun remove(key: Int) {
        set[getIdx(key)] = -1
    }

    fun contains(key: Int): Boolean {
        return set[getIdx(key)] != -1
    }

    private fun getIdx(key: Int): Int {
        return key.hashCode() % BUCKET_SIZE
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
