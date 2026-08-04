class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var i = 0
        var j = 0
        val n = nums.size
        val set = mutableSetOf<Int>()

        while (j < n) {
            if (j > i + k ) {
                set.remove(nums[i])
                i++
            }

            if (nums[j] in set) {
                return true
            }

            set.add(nums[j])
            j++
        }

        return false
    }
}
