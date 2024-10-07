fun sortStrings(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}
fun main() {
    val stringArray = arrayOf("баг", "ядро", "анекдот", "грунт")
    val sortedArray = sortStrings(stringArray)
    println("Отсортированные строки: ")
    sortedArray.forEach { println(it) }
}