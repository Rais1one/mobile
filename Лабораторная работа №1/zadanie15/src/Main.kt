fun main() {

    var numbers = 12345
    var sum = 0
    println("Входные данные: Число $numbers")
    while(numbers > 0)
    {
        sum += numbers % 10
        numbers /= 10
    }


    println("Выходные данные: Сумма цифр: $sum")

}