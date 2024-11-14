fun countTriples(n: Int): Int {
    var count = 0
    var x:Double
    for (i in 1..n) {
        for (j in 1..n) {
            x = Math.sqrt((i * i + j * j).toDouble())
            if ((x % 1).toInt() == 0 && x <= n) {
                count++
            }
        }
    }
    return count
}
