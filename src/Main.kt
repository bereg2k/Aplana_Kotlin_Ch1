/** Задание 3: Преобразование
 * Преобразуйте  в String:
 * var five: Char = '5'
 * Затем полученный String преобразуйте в Byte, Short, Int, Double, FLoat и Long
 */
fun main(args: Array<String>) {
    var five: Char = '5'
    val fiveString = five.toString()
    val fiveByte = fiveString.toByte()
    val fiveShort = fiveString.toShort()
    val fiveInt  = fiveString.toInt()
    val fiveLong = fiveString.toLong()
    val fiveFloat = fiveString.toFloat()
    val fiveDouble = fiveString.toDouble()
}