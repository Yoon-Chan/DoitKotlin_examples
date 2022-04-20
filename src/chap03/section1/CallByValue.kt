package chap03.section1

fun main() {
    val result = CallByValue(lambda())
    print(result)
}

fun CallByValue(b: Boolean): Boolean { //일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

val lambda: ()-> Boolean ={
    println("lambda function")
    true //마지막 표현식 문장의 결과가 반환
}