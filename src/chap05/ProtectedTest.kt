package chap05

//최상위 클래스에는 protected를 사용할 수 없음
open class Base2{
    protected var i =1
    protected  fun protectedFunc(){
        i+=1    //접근 허용
    }

    fun access(){
        protectedFunc() //접근 허용
    }
    protected class Nested //내부클래스 지시자 허용
}

class  Derived :Base2(){
    fun test(base :Base2):Int{
        protectedFunc() //base클래스의 메서드 접근 가능
        return i //Base클래스의 프로퍼티 접근 가능
    }
}

fun main(){
    val base = Base2() //생성 가능
    //base.i//접근 불가
    //base.protectedFunc() //접근 불가
    base.access() //접근 가능
    
}



