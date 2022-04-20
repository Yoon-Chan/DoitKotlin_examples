package chap06

/**
 *  lazy는 읽기 전용의 val로 선언한 객체나 프로퍼티를 나중에 초기화
 *
 *  다음과 같은 특징이 있습니다.
 *  호출시점에 by lazy{...} 정의에 의해 블록 부분의 초기화를 진행한다.
 *  불변의 변수 선언인 val에서만 사용 가능(읽기 전용)
 *  val이므로 값을 다시 변경할 수 없다.
 */

class LazyTest{
    init {
        println("init block")
    }

    val subject by lazy {
        println("lazy initialized")
        "Kotlin Programing"     //lazy 변환값
    }

    fun flow(){
        println("not initialized")
        println("subject one : $subject")   //최초 초기화 시점
        println("subject two : $subject")   // 이미 초기화된 값 사용
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}