package chap03.section1

//확장 함수.
// fun 확장 대상.함수이름(매개변수,...):반환값{
//  ...
//  return값
// }



//String 클래스에 확장 함수 추가하기
fun main() {
    val source = "Hello World!" //String타입
    val target = "Kotlin"

    println(source.getLongString(target))
}

//String에서 getLongString 확장 함수를 추가.
fun String.getLongString(target: String):String =
    if(this.length > target.length) this else target