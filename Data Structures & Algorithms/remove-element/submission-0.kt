class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var write = 0
        for (num in nums) {
            if (num != `val`) {
                nums[write] = num
                write++
            }
        }
        
        return write
    }
}
