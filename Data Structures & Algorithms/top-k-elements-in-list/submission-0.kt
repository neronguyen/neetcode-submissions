class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val countMap = mutableMapOf<Int, Int>()

        for (num in nums) {
            countMap[num] = countMap.getOrDefault(num, 0) + 1
        }

        return countMap
            .toList().sortedByDescending { it.second }
            .take(k).map { it.first }
            .toIntArray()
    }
}
