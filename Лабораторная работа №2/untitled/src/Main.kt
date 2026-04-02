//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val arr = arrayOf(1,2,3,4,5,6)
    var sumchet = 0
    var sumnotchet = 0
    for (i in arr.indices)
    {
        if (i%2 == 0){
            sumchet += arr[i]
        }
        else{
            sumnotchet += arr[i]
        }
    }
    val div = 9/3
    println(div)
}