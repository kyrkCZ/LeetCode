 fun canConstruct(ransomNote: String, magazine: String): Boolean {
        for (i in ransomNote) {
            if (ransomNote.count { it == i } > magazine.count { it == i }) {
                return false
            }
        }
        return true
 }