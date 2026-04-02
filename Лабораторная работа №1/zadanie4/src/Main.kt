//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val inArray: Array<Int> = arrayOf(1,2,3,4,5)
   val outArray = inArray.reversedArray() //Использовать функцию легче, чем через цикл
    println("Входные данные: Массив целых чисел ${inArray.contentToString()}")
    println("Выходные данные: Перевернутый массив: ${outArray.contentToString()}")
}