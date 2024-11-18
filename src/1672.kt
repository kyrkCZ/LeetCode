fun maximumWealth(accounts: Array<IntArray>): Int {
    var maxNum = 0
    for(account in accounts)    {
        val temp = account.sum()
        if(temp>maxNum) {
            maxNum=temp
        }
    }
    return maxNum
}