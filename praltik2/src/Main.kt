import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date
import java.time.LocalDate
import java.time.LocalDateTime
import javax.xml.catalog.CatalogManager.catalog

fun main() {
 var balance = balance()
    while(true) {
        print(
            """
          БАНК
          
    1. Добавить расход
    2. Посмотреть все расходы
    3. Посмотреть расходы по категориям
    4. Выход
    Действие: 
    """.trimIndent()
        )
        var choose = readln()
        when (choose) {
            "1" -> balance.addBalance()
            "2" -> balance.showAll()
            "3" -> balance.showCategoty()
            "4" -> return
            else -> println("Не выбрали ни один из пунктов")
        }
    }
}

class expenses{
    var sum: Double
    var categoty: String
    var date: LocalDate

    constructor(_sum: Double, catalog: String, date: LocalDate){
        this.sum = _sum
        this.categoty = catalog
        this.date = date
    }

    fun displayExpenses(){
        println("""
            Сумма расхода: $sum
            Категория: $categoty
            Дата: $date
        """.trimIndent())
    }
}

class balance{
    var balanceList = mutableListOf<expenses>()


    fun addBalance(){
        var sum: Double
        try {
            println("ДОБАВЛЕНИЕ РАСХОДА")
            print("Добавьте сумму расхода: ")
            var sum = readln().toDouble()
            print("Впишите категорию: ")
            var categoty = readln()
            print("Добавьте дату расхода (в формате ГГГГ-ММ-ДД): ")
            var date = readln()
            balanceList.add(expenses(sum, categoty, LocalDate.parse(date.toString())))
            println("Добавлено")
        }
        catch (e: Exception){
            println("Вы не правильно ввели данные")
        }

    }

    fun showAll(){
        println("ВСЕ РАСХОДЫ")
        balanceList.forEachIndexed { index, expenses ->
            println(" ${index + 1}. Сумма: ${expenses.sum} Категория: ${expenses.categoty}")
        }
        print("Чтобы посмотреть подробнее, выберете номер нужного расхода, если нет, то 0: ")
        var index = readln().toInt()
        if(index == 0){
            return
        }
        try{
            index--
            if(index >= 0 && index <= balanceList.size){
                balanceList[index].displayExpenses()
            }
            else{
                println("Расход с номером ${index+1} не найден")
            }
        }
        catch (e: Exception){
            println("Ошибка: введите число")
        }


    }

    fun showCategoty(){
        val categoty = balanceList.map{ it.categoty}.distinct()
        for (i in categoty){
            print(i)
            var sum = 0.0
            for (j in balanceList){
                if ( i == j.categoty){
                    sum += j.sum
                }
            }
            println(": $sum")
        }
    }
}