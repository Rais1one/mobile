//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var a = 12
    var b = 18
    println("Входные данные: Числа $a и $b")
    while (b!=0)
    {
        val temp = b
        b = a%b
        a=temp
    }

    println("Выходные данные: НОД: $a")

}