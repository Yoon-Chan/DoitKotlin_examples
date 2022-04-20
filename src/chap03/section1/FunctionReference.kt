package chap03.section1

fun main() {
    // :: 은 함수 참조기호
    //인자와 반환값이 있는 함수.
    val res1 = funcParam(3,2,::sum3)
    println(res1)

    //인자가 없는 함수
    hello(::text)
    //아래와 같이 작성 가능.
    // hello({a, b -> text(a,b)})
    // hello {a,b-> text(a,b)}


    //일반 변수에 값처럼 할당.
    val likeLambda = ::sum3
    println(likeLambda(6,6))
}

fun sum3(a:Int, b:Int) = a+b

fun text(a:String, b:String) ="Hi $a $b"

fun funcParam(a:Int, b:Int, c: (Int, Int)->Int): Int {
    return c(a,b)
}

fun hello(body: (String,String)->String): Unit{
    println(body("Hello", "world"))
}