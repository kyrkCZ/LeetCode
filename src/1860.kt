fun memLeak(memory1: Int, memory2: Int): IntArray {
        var memory1 = memory1
        var memory2 = memory2
        while(true){
            var bits = 1
            while(memory1 >= bits || memory2 >= bits)
            {
                if(memory1 >= memory2) {
                    memory1 -= bits
                }else{
                    memory2 -= bits
                }
                ++bits
            }
            return intArrayOf(bits, memory1, memory2)
        }
}
// Time complexity: O(N)
// Space complexity: O(1)