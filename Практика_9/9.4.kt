fun areAnagrams(str1: String, str2: String): Boolean {
    val cleanedStr1 = str1.replace("\\s".toRegex(), "").lowercase()
    val cleanedStr2 = str2.replace("\\s".toRegex(), "").lowercase()
    return cleanedStr1.toCharArray().sortedArray().contentEquals(cleanedStr2.toCharArray().sortedArray())
}
fun main() {
    val string1 = readln()
    val string2 = readln()
    if (areAnagrams(string1, string2)) {
        println("\"$string1\" и \"$string2\" являются анаграммами.")
    } else {
        println("\"$string1\" и \"$string2\" не являются анаграммами.")
    }
}