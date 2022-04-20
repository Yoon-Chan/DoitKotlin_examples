package chap06

/* lateinit의 제한
   lateinit 키워드를 사용하면 프로퍼티에 값이 바로 할당되지 않않도 컴파일러에서 허용
   단 실행할 때까지 값이 비어있는 상태면 오류를 유발할 수 있으니 주의

   조건
   1. var로  선언된 프로퍼티만 가능.
   2. 프로퍼티에 대한 게터와 세터를 사용할 수 없다.
 */

class Person{
    lateinit var name:String //지연 초기화를 위한 선언.

    fun test(){
        if(!::name.isInitialized) //프로퍼티의 초기화 여부 판단.
        {
            println("not initialized")
        } else{
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kildong"    // 이 시점에서 초기화됨(지연 초기화)
    kildong.test()
    println("name = ${kildong.name}")
}