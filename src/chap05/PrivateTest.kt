package chap05

private class PrivateClass{
    private var i =1
    private  fun privateFunc(){
        i+=1 //접근 허용
    }

    fun access(){
        privateFunc() //접근 허용용
   }
}

class OtherClass{
    //다른 클래스에서 프로퍼티로서 PrivateClass 객체를 지정하려면 private로 선언.
    // val opc = PrivateClass() //불가 - 프로퍼티 opc는 private 되어야함.
    fun test(){
        val pc = PrivateClass() //생성 가능
    }
}

fun main(){
    val pc =PrivateClass() //생성 가능
    //pc.i //접근 불가
    //pc.privateFunc() //접근 불가
}

fun ToopFunction(){
    val tpc = PrivateClass() //객체 생성 가능
}