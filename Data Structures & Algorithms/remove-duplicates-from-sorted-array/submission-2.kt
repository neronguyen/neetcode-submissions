class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 1
        var j = 1
        var last = nums[0] 

        while (j < nums.size) {
            if (nums[j] != last) {
                nums[i] = nums[j]
                i++
                last = nums[j]
            }

            j++
        }

        return i
    }
}
