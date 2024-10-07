import kotlin.random.Random
fun generatePassword(length: Int): String {
    val lowercaseLetters = ('a'..'z').toList()
    val uppercaseLetters = ('A'..'Z').toList()
    val digits = ('0'..'9').toList()
    val specialCharacters = listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '{', '}', '[', ']', ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/')
    val allCharacters = lowercaseLetters + uppercaseLetters + digits + specialCharacters
    return (1..length)
        .map { allCharacters.random() }
        .joinToString("")
}
fun main() {
    print("Введите длину пароля: ")
    val length = readLine()?.toIntOrNull()
    if (length == null || length < 1) {
        println("Длина пароля должна быть положительным числом. Пожалуйста, попробуйте еще раз.")
        return
    }
    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}