/** Задание 4: Приветствие пользователя
 * Напишите программу, запрашивающую имя пользователя и выводящую приветствие пользователя в консоль, после ввода имени.
 */
fun main(args: Array<String>) {
    println("What's your name, mate?")
    val usernameInput = readLine()
    println("Hello, $usernameInput! It's nice to see you!")
}