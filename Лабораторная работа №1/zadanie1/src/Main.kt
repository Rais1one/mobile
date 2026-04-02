//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val str  = 123321
    val ftrstPart = str/1000
    val secendPart = str%1000
    var sumfirst = 0
    var sumsecond = 0
    for(i in 1..3){
        if(i==1){
            sumfirst += ftrstPart%10
            sumsecond += secendPart%10
        }
        if(i==2){
            sumfirst += (ftrstPart%100)/10
            sumsecond += (secendPart%100)/10
        }
        if(i==3){
            sumfirst += ftrstPart/100
            sumsecond += secendPart/100
        }

    }
    if(sumfirst == sumsecond){
        println("lf")
    }


}