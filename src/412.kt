fun fizzBuzz(n: Int): List<String> {
    val string = mutableListOf<String>()
    for (number in 1..n) {
        if (number.mod(3) == 0 || number.mod(5) == 0) {
            if (number.mod(3) == 0 && number.mod(5) == 0) {
                string.add("FizzBuzz")
            } else if (number.mod(3) == 0) {
                string.add("Fizz")
            } else {
                string.add("Buzz")
            }
        } else {
            string.add(n.toString())
        }
    }
    return string
}