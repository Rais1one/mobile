//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = arrayOf(10,20,5,30,15)
    var max = 0
    var second = 0

    for(i in numbers)
    {
        if(i > max)
        {
            second = max
            max = i
        }
        else if (i > second && i == max)
        {
            second = i
        }
    }
    println("Входные данные:  Массив ${numbers.contentToString()}")
    println("Выходные данные: Второй по величине элемент: $second")

}