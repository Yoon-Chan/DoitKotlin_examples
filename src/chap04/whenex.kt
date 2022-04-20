package chap04

/*
*   when문은 다음과 같이 true,false,변수,표현식 등의 조건을
*   when문의 인자에 넣으면 when문을 구성할 수 있다.
*
*   when(인자){
*   인자에 일치하는 값 혹은 표현식 -> 수행할 문장
*   인자에 일치하는 범위 -> 수행할 문장.
*   ...
*   else ->수행할 문장
* }
*   일치되는 조건을 한번에 여러개 표현하려면 쉼표(,)를 이용하면 됩니다.
*   when(x){
*       in 1..10 -> print("x는 1이상 10 이하")
*       !in 10..20 -> print("x는 10 이상 20 이하의 범위에 포함되지 않느다.")
*       else -> print("x는 어떤 범위에도 없습니다.")
*   }
*
*   is 키워드를 사용하면 특정 자료형을 검사할 수 있다.
*   when(str){
*       is String->"문자열입니다."
*       else -> false
*   }
* */


fun main() {
    //ex1() when문을 이용해 점수 등급 구하기
    //ex2() //인자가 없는 when문 사용하기
    //다양한 자료형의 인자 받기
    ex3()
}


fun ex1(){
    print("Enter the Score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when(score){
        in 90.0..100.0 -> grade ='A'
        in 80.0..89.9 -> grade='B'
        in 70.0..79.9 -> grade='C'
        !in 70.0..100.0 -> grade='F'
    }

    println("Score : $score, Grade : $grade")
}

fun ex2(){
    print("Enter the score : ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when{
        score >= 90.0 -> grade='A'
        score in 80.0..89.9 -> grade ='B'
        score in 70.0..79.9 -> grade='C'
        score < 70.0 -> grade ='F'
    }
    println("Score : $score, Grade : $grade")

}

fun ex3(){
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis()) //현재 시간(밀리초단위)를 Long값으로 변환
    cases(MyClass()) //객체
}

fun cases(obj:Any){
    when(obj){
        1-> println("Int : $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String->println("Not a String")
        else-> println("Unknown")

    }
}

class MyClass()