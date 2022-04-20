package chap05

//주생성자와 부 생성자 같이 사용하기
class Person(firstName:String, out:Unit=println("[Primary Constructor] Parameter")){
    val fname = println("[Property] Person fName : $firstName")

    init {
        println("[init] Person init block")
    }

    //부 생성자.
    constructor(firstName: String, age:Int,
    out:Unit=println("[Secondeary Constructor] Parameter")): this(firstName){
        println("[Secondary Constructor] Body: $firstName, $age")
    }
}

fun main() {
    val p1 = Person("Kildong", 30)
    println()
    val p2 = Person("Dooly")
}