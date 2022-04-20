package chap03.section1

fun main() {
    val result = callByName(otherLambde) //람다식 이름으로 호출
    print(result)
}

fun callByName(b: ()->Boolean): Boolean{
    println("callByName function")
    return b()
}

val otherLambde: ()->Boolean ={
    println("otherLambda function")
    true
}