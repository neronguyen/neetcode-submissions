class Solution {
    // Pattern: 2 Pointers
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var n = numbers.size

        for (i in 0..<n - 1) {
            var j = i + 1
            
            while (j < n && numbers[i] + numbers[j] <= target) {
                if (numbers[i] + numbers[j] == target) {
                    return intArrayOf(i + 1, j + 1)
                }

                j++
            }
        }

        return intArrayOf()
    }
}
