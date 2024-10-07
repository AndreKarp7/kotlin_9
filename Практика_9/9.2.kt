fun main(){
    print("str = ")
    val str = readln()
    var sumVovels:Int = 0
    var sumCons:Int = 0
    for (s in str){
        when(s){
            'a', 'e', 'o', 'i', 'u', 'y' -> sumVovels++
            else -> sumCons++
        }
    }
    println("Vowels in str = ${sumVovels}\t Consonants: ${sumCons}")

}