fun isPrimeNum(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}
fun findPrimes(N: Int) {
    println("Простые числа до $N:")
    for (i in 2..N) {
        if (isPrimeNum(i)) {
            print("$i ")
        }
    }
    println()
}
fun main() {
    val N = readln().toInt()
    findPrimes(N)
}