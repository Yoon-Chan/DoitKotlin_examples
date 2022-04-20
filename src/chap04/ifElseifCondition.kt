package chap04

//else if 문을 사용한 등급 판별기

fun main() {
    print("Enter the score: ")
    //!!은 단정 기호 null인 경우 예외를 발생할 수 있다.
    val score = readLine()!!.toDouble() //콘솔로부터 입력 받음
    var grade: Char = 'F'

    if(score>=90.0){
        grade = 'A'
        //in 범위연산자로 줄일수 있다.
        // 변수이름 in 시작값 .. 마지막값
    }else if (score in 80.0 .. 89.0 /*score >= 80.0 && score <= 89.9*/){
        grade = 'B'
    }else if(score >= 70.0 && score <79.9){
        grade ='C'
    }

    println("Score : $score, greade : $grade")

}