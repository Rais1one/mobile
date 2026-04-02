//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = arrayOf(1,-2,3,-4,5)
    var count = 0

    for (i in numbers)
    {
        if (i < 0)
        {
            count++
        }
    }

    println("Входные данные: Массив ${numbers.contentToString()}")
    println("Выходные данные: Количество отрицательных чисел:  $count")

}