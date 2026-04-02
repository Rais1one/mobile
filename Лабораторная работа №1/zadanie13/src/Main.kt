//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val numbers = arrayOf(10,5,20,3,15)
    var min = numbers[0]

    for(i in numbers)
    {
        if (i < min)
        {
            min = i
        }
    }

    println("Входные данные: Массив ${numbers.contentToString()}")
    println("Выходные данные: Минимальный элемент: $min")
}