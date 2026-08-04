class Solution {
    // Pattern: 2 Pointers
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i = 0
        var j = numbers.lastIndex
    
        while (i < j) {
            val num1 = numbers[i]
            val num2 = numbers[j]

            if (num1 + num2 == target) {
                return intArrayOf(i + 1, j + 1)
            }

            if (num1 + num2 > target) {
                j--
            } else {
                i++
            }
        }

        return intArrayOf()
    }
}
