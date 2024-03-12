 fun minSwap(nums1: IntArray, nums2: IntArray): Int {
        val n = nums1.size
        var swap = 1
        var dontswap = 0
        for (i in 1 until n) {
            var swap2 = n
            var dontswap2 = n
            if (nums1[i] > nums1[i - 1] && nums2[i] > nums2[i - 1]) {
                swap2 = Math.min(swap2, swap + 1)
                dontswap2 = Math.min(dontswap2, dontswap)
            }
            if (nums1[i] > nums2[i - 1] && nums2[i] > nums1[i - 1]) {
                swap2 = Math.min(swap2, dontswap + 1)
                dontswap2 = Math.min(dontswap2, swap)
            }
            swap = swap2
            dontswap = dontswap2
        }
        var swaps = Math.min(swap, dontswap)
        return swaps
 }
// Time complexity: O(N)
// Space complexity: O(1)