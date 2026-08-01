class Solution {
    fun majorityElement(nums: IntArray): Int {
        var lead = -1
        var count = 0
        
        for (num in nums) {
            if (count == 0) {
                lead = num
                count = 1
            } else {
                if (lead == num) {
                    count++
                } else {
                    count--
                }
            }
        }

        return lead
    }
}
