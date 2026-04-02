//Функция main с созданием расписания
fun main() {

    val schedule = readSchedule()
    printSchedule(schedule)
}

//Функция для ввода расписания уроков с возвращением Map
fun readSchedule(): MutableMap<String, MutableList<String>>
{
    //Создание словаря с днями недели
    val map = mutableMapOf(
        "Понедельник" to mutableListOf<String>(),
        "Вторник" to mutableListOf(),
        "Среда" to mutableListOf(),
        "Четверг" to mutableListOf(),
        "Пятница" to mutableListOf(),
        "Суббота" to mutableListOf(),
        "Воскресенье" to mutableListOf(),
    )
    println("ВВОД РАСПИСАНИЯ")
    //Проход по каждому дня
    for ((day, lessons) in map)
    {
        println("\n$day")

        //Цикл для ввода уроков
        while (true)
        {
            print("Введите урок или next для перехода на следующий день: ")
            val input = readLine()

            if (input == "next")
            {
                break
            }

            if (input == null)
            {
                println("Ошибка ввода")
                continue
            }

            if (input.isEmpty())
            {
                println("Урок не может быть пустым")
                continue
            }
            if (input in lessons)
            {
                println("Урок уже есть в расписании")
                continue
            }
            lessons.add(input)
            println("Урок $input добавлен")


        }
    }
    return map
}

//Функция для вывода расписания
fun printSchedule (schedule: Map<String, MutableList<String>>)
{
    println("\nРАСПИСАНИЕ")
    //Цикл, который выводит расписание
    for ((day, lessons) in schedule)
    {
        print("$day: ")
        if (lessons.isEmpty())
        {
            println("нет уроков")
        }
        else
        {
            println(lessons.joinToString  (", "))
        }
    }
}