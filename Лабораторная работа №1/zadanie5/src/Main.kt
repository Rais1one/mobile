//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val n: Int = 20
    val simple = BooleanArray(n+1) {true}
    simple[0] = false
    simple[1] = false

    for(i in 2..n) {
        if (simple[i]) {
            var j = i * 2
            while (j <= n) {
                simple[j] = false
                j += i
            }
        }
    }
    val res = mutableListOf<Int>()
    for (i in 2..n)
    {
        if (simple[i]) {
            res.add(i)
        }
    }
    println("Входные данные: Число N = $n")
    println("Выходные данные: Простые числа:  $res")
}