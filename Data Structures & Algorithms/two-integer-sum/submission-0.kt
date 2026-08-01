class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for ((index, num) in nums.withIndex()) {
            val otherIndex = map[target - num]
            if (otherIndex != null) {
                return intArrayOf(otherIndex, index)
            }   

            map[num] = index
        }

        return intArrayOf()
    }
}
