package chap03.section1


// func sum(a: Int, b: Int) Int =a+b 이렇게 가능.
fun sum(a: Int, b: Int): Int
{
    var sum = a+b;
    return sum
}

//반환값이 없는 함수 만들기 Unit 생략 가능. Unit은 void와 비슷함.
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a+b}")
}

// email을 항상 default로 설정하고 싶으면 아래와 같이 작성
// 이러면 함수를 사용할 때 add("윤찬")으로만 사용 가능.
fun add(name:String, email:String = "default"){
    println("add fun")
}


fun max(a:Int, b: Int) = if (a>b) a else b
fun main() {
    val result = sum(3,2)
    val result2 = sum(6,7)
    println(result)
    println("result2 : $result2")

    val result3 = max(3,2)
    println("result : $result, max : $result3")
}