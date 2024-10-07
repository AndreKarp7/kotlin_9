var strCased:String = ""
fun registr(str:String):String {
    str.forEach {
        when{
            it.isLowerCase() -> strCased += it.uppercaseChar()
            else -> strCased += it.lowercaseChar()
        }
    }
    return strCased
}
fun main(){
    print("str = ")
    val str = readln()
    println("Bilo: ${str}\nStalo: ${registr(str)}")
}