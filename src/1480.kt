fun runningSum(nums: IntArray): IntArray {
    var counter = 0
    var sum = 0
    for (int in nums) {
        nums[counter]= int + sum
        sum=sum+int
        counter++
    }
    return nums
}