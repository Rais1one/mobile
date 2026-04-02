//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var max: Int = 0
    val numbers: Array<Int> = arrayOf(10,20,5,30,15)

    for (i in numbers)
    {
        if (i > max){
            max = i
        }
    }
    println("Входные данных: Массив целых чисел: ${numbers.contentToString()}")
    println("Выходные данные: Максимальный элемент: $max")
}