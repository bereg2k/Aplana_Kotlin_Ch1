/** Задание 6: Сравнение
 * Напишите программу, которая запрашивает у пользователя два числа в переменные “a” и “b”.
 * Проверьте больше ли "a" чем "b" и получите результат в виде переменой типа boolean.
 */
fun main(args: Array<String>) {
    print("Please enter variable \"a\": ")
    val a = readLine()!!

    print("Please enter variable \"b\": ")
    val b = readLine()!!

    // Конвертируем введеный String в Double для расширения принимаемых для сравнения значений
    // NumberFormatException будем получать только для пустых/нечисловых значений a и/или b
    val aMoreThanB = a.toDouble() > b.toDouble()
    print("a > b? Answer: $aMoreThanB")
}