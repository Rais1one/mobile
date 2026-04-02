//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = arrayOf(5,3,8,1,2)
    println("Входные данные: Массив ${numbers.contentToString()}")
    for (i in 0 until numbers.size - 1)
    {
        for (j in 0 until numbers.size - 1 -i) {
            if (numbers[j] > numbers[j+1])
            {
                val temp = numbers[j]
                numbers[j] = numbers[j+1]
                numbers[j+1] = temp
            }
        }
    }

    println("Выходные данные: Отсортированный массив: ${numbers.contentToString()}")
}