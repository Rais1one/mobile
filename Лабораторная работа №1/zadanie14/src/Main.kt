//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val str = "Примет, мир!"
    val glasnye = "ауоеэёяюиы"
    var count = 0

    for (char in str)
    {
        if (char in glasnye)
        {
            count++
        }
    }

    println("Входные данные: $str")
    println("Выходные данные: Количество гласных:  $count")

}