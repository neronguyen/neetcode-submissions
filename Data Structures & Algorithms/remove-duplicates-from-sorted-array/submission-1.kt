class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        var j = 0 
        var k = 1

        while (k < nums.size) {
            if (nums[j] != nums[k]) {
                nums[i] = nums[j]
                i++
                j = k
            }

            k++
        }

        println(i)
        nums[i] = nums.last()
        return i + 1
    }
}
