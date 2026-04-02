fun main() {
    val numbers = arrayOf(1,2,2,3,4,4,5)
    val uniq = Array(numbers.size){0}
    var uniqIndex = 0
    for (i in numbers.indices)
    {
        var Dublicat = false
        for (j in 0 until uniqIndex)
        {
            if (numbers[i] == uniq[j])
            {
                Dublicat = true
            }
        }
        if(!Dublicat)
        {
            uniq[uniqIndex] = numbers[i]
            uniqIndex++
        }
    }
    val result = uniq.copyOf(uniqIndex)
    println("Входные данные: Массив ${numbers.contentToString()}")
    println("Выходные данные: Массив без дубликатов: ${result.contentToString()}")
}