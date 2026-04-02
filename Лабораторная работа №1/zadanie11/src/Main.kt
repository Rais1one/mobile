//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val n = 5
    var fact = 1
    for(i in 1..n)
    {
        fact = fact*i
    }
    println("Входные данные: Число N = $n")
    println("Выходные данные: Факториал: $fact")
}