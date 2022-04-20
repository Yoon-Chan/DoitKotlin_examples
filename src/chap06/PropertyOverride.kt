@file:JvmName("PKLevel") // 상단코드에 입력하면 접근할 클래스의 이름을 바굴 수 있다.
package chap06

open class First{
    open val x :Int =0
        get() {
            println("First x")
            return field
        }

    val y : Int=0 //open 키워드가 없으면 final 프로퍼티.
}

class  Second: First(){
    override val x : Int =0 // 상위 클래스와 구현부가 다르게 오버라이딩 됨.
    get() {
        println("Second x")
        return field+3
    }
    //override val y: Int = 0 // 오류 오버라이딩 불가.
}

fun main() {
    val second =  Second()
    println(second.x)   //오버라이딩 된 두번째 클래스 객체의 x
    println(second.y)   // 상위 클래스로부터 상속받은 값.
}