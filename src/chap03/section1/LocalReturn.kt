package chap03.section1

fun main() {
    //After calling out() 이 호출되지 않음
    /*
    shortFucn3(3){
        println("First call: $it")
        return
    }
    */

    shortFunc4(4) {
        println("First call: $it")
        //return  사용 불가가
    }

}
//return 사용 가능
inline fun shortFucn3(a:Int, out: (Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

//return 사용 불가능.
// crossinlin 키워드는 비지역 반환을 금지해야하는 람다식에 사용.
inline fun shortFunc4(a:Int, crossinline out:(Int)->Unit){
    println("crossinline : Before calling out()")
    nestedFunc{ out(a) }
    println("crossinlin : After calling out()")
}

fun nestedFunc(body: ()->Unit){
    body()
}