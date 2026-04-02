//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = arrayOf(5,10,15,20)
    val tar = 15
    var index = -1

    for(i in numbers.indices)
    {
        if (numbers[i] == tar)
        {
            index = i
        }
    }

    println("Входные данные: Массив ${numbers.contentToString()}, элемент $tar")
    println("Выходные данные: Индекс элемента: $index")
}