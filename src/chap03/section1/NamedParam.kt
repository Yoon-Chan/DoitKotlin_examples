package chap03.section1
fun namedParam(x:Int = 100, y:Int = 200, z:Int){
    println(x+y+z)
}

//매개변수가 고정되지 않은 함수 사용하기. 매개변수 앞에 vararg 사용
fun normalVarargs(vararg count:Int){
    for (num in count){
        print("$num")
    }
    println()
}

//인자에 일반 함수 사용해보기.
fun sum2(a:Int, b:Int )= a+b

fun mul(a:Int,b:Int) = a*b
fun main() {
    //아래와 같이 매개변수를 직접 호출하여  사용 가능.
    namedParam(x=200, z=100)//500
    namedParam(z=150)// 450

    //매개변수가 고정되지 않은 변수 호출.
    normalVarargs(1,2,3,4,5)
    normalVarargs(4,5,6)

    val res1 = sum(3,2)
    val res2 = mul(sum(3,3,), 3) //인자에 함수 사용

    println("res $res1, \$, res2: $res2")

    //람다식 함수 작성
    var result:Int
    // val multi:(Int,Int)->Int = {x: Int, y:Int -> x*y}
    // val multi: (Int,Int)->Int = {x,y -> x*y} 와 같음

    val multi ={ x:Int, y:Int -> x*y} //일반 변수에 람다식 할당
    //val multi = {x,y->x*y} 이건 오류 추론이 되지 않기 때문.

    result = multi(10,20)
    println(result)


    //람다식 자료형 생략
    val greet = { println("Hello World!") }     //추론 가능
    val square = {x:Int -> x*x} //자료형을 생략하려면 x는 자료형 명시를 해야한다.
    val nestedlambda = {{ println("nested") }} //추론 가능.

    println("highOrder(10,20) : ${highOrder({x,y->x+y},20,10)}")

    //인자와 반환값이 없는 람다식 함수.
    val out: () -> Unit= { println("Hello World!") }

    out()//함수처럼 사용가능.
    val new =out //람다식이 들어있는 변수를 다른 변수에 할당.
    new()
}

//매개변수에 람다식 함수를 사용한 고차 함수.
fun highOrder(sum:(Int, Int)->Int, a:Int, b:Int):Int{
    return sum(a,b)
}


