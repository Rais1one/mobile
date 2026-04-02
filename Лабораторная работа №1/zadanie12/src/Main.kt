//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val str = "мадам"
    var palindrome = true

    for(i in 0 until str.length/2)
    {
        if(str[i] != str[str.length -1 - i]){
            palindrome = false
        }
    }
    println("Входные данные: $str")
    println("Выходные данные: $palindrome")
}