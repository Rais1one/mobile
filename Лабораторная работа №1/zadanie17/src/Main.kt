//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val number = 17
    var Simple = true

    if(number < 2)
    {
        Simple = false
    }
    else
    {
        for (i in 2..number/2)
        {
            if (number % i == 0)
            {
                Simple = false
            }
        }
    }

    println("Входные данные: $number")
    println("Выходные данные: $Simple")

}