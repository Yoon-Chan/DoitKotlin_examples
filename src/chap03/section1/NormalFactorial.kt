package chap03.section1

import java.math.BigInteger

/*
* 꼬리 재귀함수
*
* 재귀란 자기 자신을 다시 참조하는 방법을 의미
*
* 재귀함수의 조건
* 무한 호출에 빠지지 않도록 탈출 조건을 만들어 둔다.
* 스택 영역을 이용하므로 호출 횟수를 무리하게 많이 지정해 연산하지 않는다.
* 코드를 복잡하지 않게 한다.
*
*
* */

fun main() {
    val number = 4
    val result:Long

    result = factorial(number)
    println("Factorial: $number! -> $result")

    val n =5
    println("Factorial2: $n! -> ${factorial2(n)}")

    //피보나치
    val n2 = 100
    val first = BigInteger("0")
    var second = BigInteger("1")
    print("fibonacci $n2 -> ${fibonacci(n2,first,second)}")
}

fun factorial(number: Int):Long{
    return if(number==1) number.toLong() else number* factorial(number-1)
}

//꼬리 재귀를 사용하여 팩토리얼 만들기 tailrec 사용
tailrec fun factorial2(n:Int, run:Int=1):Long{
    return if(n==1) run.toLong() else factorial2(n-1, run*n)
}

//피보나치 수열을 꼬리재귀로 만들기

tailrec fun fibonacci(n:Int, a:BigInteger, b: BigInteger): BigInteger{
    return if(n==0) a else fibonacci(n-1,b,a+b)
}