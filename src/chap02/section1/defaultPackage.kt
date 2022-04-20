package chap02.section1

import kotlin.math.PI
import kotlin.math.abs
// 현재 패키지와 다른 패키지의 클래스 이름이 같은 경우
// 다른패키지를 임포트한 곳에서 as 사용할명 으로 지정하여 사용하면 충돌이 사라짐.
import com.example.edu.Person as User

fun main(){
    val intro: String="안녕하세요!"
    val num: Int =20

    println(PI)
    println(abs(-12.6))
    println("intro: $intro, num: $num")


    var user1 = Person("A123", "Kildong")
    println(user1.id)
    println(user1.name)

    var user2 = User("Kildong", 30)
    println(user2.name)
    println(user2.age)
}
// 값이 변경되지 않아야한다면 val을 이용, 변경 되어야한다면 var을 이용하여 변수를 선언.
/*
*   val     username :  String  =    "Kildong"
* (선언키워드) (변수이름) (자료형)          (값)
*
*  val username = "Kildong" 으로 할당해도 됨
* 이러한 경우 문자열이므로 변수의 자료형을 String으로 추론하여 지정됨.
*
* 단, 자료형을 지정하지 않은 변수는 반드시 자료형을 추론할 값을 지정해야한다.
* var usernaem (x)
* */
class Person(var id:String, val name: String)