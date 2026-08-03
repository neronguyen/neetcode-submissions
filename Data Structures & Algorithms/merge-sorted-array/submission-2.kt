class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var i = nums1.lastIndex - n
        var j = nums2.lastIndex
        var k = nums1.lastIndex

        repeat(nums1.size) {
            if (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i]
                    i--
                } else {
                    nums1[k] = nums2[j]
                    j--
                }
            } else {
                if (i < 0) {
                    nums1[k] = nums2[j]
                    j--
                } else {
                    nums1[k] = nums1[i]
                    i--
                }
            }

            k--
        }
    }
}
