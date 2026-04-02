fun main() {
    val number = 12
    val divs = mutableListOf<Int>()

    for(i in 1..number)
    {
        if(number % i == 0)
        {
            divs.add(i)
        }
    }

    println("Входные данные: Число $number")
    println("Выходные данные: Делители: $divs")
}