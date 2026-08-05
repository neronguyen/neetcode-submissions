class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val result = nums.binarySearch(target)
        return if (result < 0) -(result + 1) else result
    }
}
