class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val prefixSums =  nums.scan(1, Int::times)
        val reversedPrefixSums = IntArray(n + 1) { nums.getOrNull(it) ?: 1 }
        for (i in nums.indices.reversed()) {
            reversedPrefixSums[i] = reversedPrefixSums[i] * reversedPrefixSums[i + 1]
        }

        val result = IntArray(nums.size) {
            prefixSums[it] * reversedPrefixSums[it + 1]
        }

        return result
    }
}
