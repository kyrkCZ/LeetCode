fun removeElement(nums: IntArray, `val`: Int): Int {
    var counter = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[counter] = nums[i]
            counter++
        }
    }
    return counter
}