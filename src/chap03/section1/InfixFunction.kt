package chap03.section1

/*
*    중위표현법이란 클래스의 멤버를 호출할 때 사용하는 점(.)을 생략하고
* 함수 이름 뒤에 소괄호를 붙이지 않아 직관적인 이름을 사용할 수 있는 표현법.
* 즉, 중위 함수란 일종의 연산자를 구현할 수 있는 함수.
*
* 중위함수의 조건
* 1. 멤버 메서드 또는 확장 함수여야한다.
* 2. 하나의 매개변수를 가져야한다.
* 3. infix키워드를 사용하여 정의한다.
* */

fun main() {
    //일반 표현법
    // val multi = 3.multiplay(10)

    //중위표현법
    val multi = 3 multiply 10
    print("multi: $multi")
}

 infix fun Int.multiply(x:Int):Int{
    return this*x
}