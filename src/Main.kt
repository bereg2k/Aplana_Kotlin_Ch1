/** Задание 5: Алфавит
 * Создайте переменную, содержащую последовательность английского алфавита наоборот – начиная с последней буквы алфавита и заканчивая первой буквой.
 */
fun main(args: Array<String>) {
    val alphabetBackwardsLarge = 'Z' downTo 'A'
    val alphabetBackwardsSmall = 'z' downTo 'a'

    for (i in alphabetBackwardsLarge)
        print("$i ")

    print("\n")

    for (i in alphabetBackwardsSmall)
        print("$i ")
}