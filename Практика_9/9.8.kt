import kotlin.random.Random
fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var userGuess: Int? = null
    var attempts = 0
    println("Загаданно число от 1 до 100. Попробуйте отгадать его!")
    while (userGuess != randomNumber) {
        print("Введите предполагаемое число: ")
        val input = readLine()
        userGuess = input?.toIntOrNull()
        if (userGuess == null) {
            println("Пожалуйста, введите действительное число.")
            continue
        }
        attempts++
        when {
            userGuess < randomNumber -> println("Загаданное число больше!")
            userGuess > randomNumber -> println("Загаданное число меньше!")
            else -> println("Поздравляем! Вы отгадали загаданное число $randomNumber с $attempts попыток!")
        }
    }
}