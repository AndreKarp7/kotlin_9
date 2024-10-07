package Практика_9
fun main(){
    print(  "--------------------------------------\n"+
            "|   Курс                             |\n" +
            "|              1 доллар = 94 рубля   |\n" +
            "--------------------------------------\n ")
    print("\nDollars = ")
    val dollar = readln().toInt()
    println("\n${dollar}$ to rubles = ${dollar * 94}P")
}