fun main() {
    println("=================================")
    println("    Учет расходов")
    println("=================================")

    val tracker = FinanceTracker()

    while(true) {
        println("\n1. Добавить расход")
        println("2. Показать все")
        println("3. Итого по категориям")
        println("4. Выход")
        print("Выбор: ")

        when(readln()) {
            "1" -> tracker.add()
            "2" -> tracker.list()
            "3" -> tracker.summary()
            "4" -> {
                println("До свидания!")
                return
            }
            else -> println("Ошибка")
        }
    }
}

class Expense(val sum: Double, val cat: String, val dt: String)

class FinanceTracker {
    private val list = mutableListOf<Expense>()

    fun add() {
        try {
            println("\n--- НОВЫЙ РАСХОД ---")
            print("Сумма: ")
            val s = readln().toDouble()
            print("Категория: ")
            val c = readln()
            print("Дата (ГГГГ-ММ-ДД): ")
            val d = readln()
            list.add(Expense(s, c, d))
            println("Добавлено!")
        } catch(e: Exception) {
            println("Ошибка ввода")
        }
    }

    fun list() {
        println("\n--- СПИСОК ---")
        if(list.isEmpty()) {
            println("Пусто")
            return
        }
        list.forEachIndexed { i, e ->
            println("${i+1}. ${e.sum} руб. (${e.cat}) - ${e.dt}")
        }

        print("\nНомер для деталей (0 - назад): ")
        val n = readln().toIntOrNull()
        if(n != null && n in 1..list.size) {
            val e = list[n-1]
            println("--------")
            println("Сумма: ${e.sum} руб.")
            println("Категория: ${e.cat}")
            println("Дата: ${e.dt}")
            println("--------")
        }
    }

    fun summary() {
        println("\n--- ПО КАТЕГОРИЯМ ---")
        if(list.isEmpty()) {
            println("Нет данных")
            return
        }
        val cats = list.map { it.cat }.distinct()
        for(c in cats) {
            val total = list.filter { it.cat == c }.sumOf { it.sum }
            println("$c: $total руб.")
        }
        println("\nВСЕГО: ${list.sumOf { it.sum }} руб.")
    }
}