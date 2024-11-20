fun numberOfSteps(num: Int): Int {
    var num = num
    var step = 0
    while (num!=0)  {
        if (num.mod(2)==0) {
            num /= 2
            step++
        } else {
            num -= 1
            step++
        }
    }
    return step
}