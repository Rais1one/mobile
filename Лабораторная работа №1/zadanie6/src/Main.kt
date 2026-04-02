//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = arrayOf(10,20,30,40,50)
    var sum = 0

    for(i in numbers)
    {
        sum += i
    }
    var ave = sum / numbers.size
    println("Входные данные:  Массив целых чисел ${numbers.contentToString()}")
    println("Выходные данные: Среднее арифметическое: $ave")
}