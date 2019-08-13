/** Задание 1: Переменные
 *
 * 1) Создайте переменную со значением null типа Any?
 * 2) Переопределите значение ранее созданной переменной на любую цифру
 * 3) Создайте переменную, не указывая её тип и присвойте ей значение из ранее созданной переменной деленную на 2,5
 * 4) Напишите в комментарии какого типа последняя переменная
 */
fun main(args: Array<String>) {
    var someVar: Any? = null
    someVar = 7
    val anotherVar = someVar / 2.5
    print("anotherVar = $anotherVar and it is of ${anotherVar.javaClass} type")
}