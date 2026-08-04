class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var i = 0
        val n = nums.size

        while (i < n - 1) {
            var j = i + 1
            
            while (j - i <= k && j < n) {
                if (nums[i] == nums[j]) {
                    return true
                }

                j++    
            }

            i++
        }

        return false
    }
}
