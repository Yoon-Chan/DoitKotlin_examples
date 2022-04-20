package chap08.section2

//2차원 배열을 평탄화 하기
fun main(){
    val numbers = arrayOf(1,2,3)
    val strs = arrayOf("One", "Two", "Three")
    val simpleArray = arrayOf(numbers, strs)
    simpleArray.forEach { println(it) }

    val flattenSimpleArray = simpleArray.flatten()
    println(flattenSimpleArray)
    
}