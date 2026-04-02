//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var count: Int = 0
    val numbers: Array<Int> = arrayOf(1,2,3,4,5,6)

    for (i in numbers)
    {
        if (i % 2 == 0)
        {
            count++
        }
    }
    println("Входнные данные: Массив целых чисел ${numbers.contentToString()}")
    println("Выходные данные: Количество четных чисел: $count")
}