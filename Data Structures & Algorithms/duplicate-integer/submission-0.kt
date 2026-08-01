class Solution {
    // Maintain a HashSet of seen values.
    // If a number already exists in the set, we've found a duplicate.
    // Time: O(n), Space: O(n)
    fun hasDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        for (i in nums) {
            if (set.add(i) == false) {
                return true
            }
        }

        return false
    }
}
