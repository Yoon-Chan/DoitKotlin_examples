package chap05

open class A{
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B{
    fun f() =println("B Interface f()") //인터페이스는 기본적으로 open이다.
    fun b() = println("B Interface b()")
}

class C:A(), B{
    //컴파일 되려면 f()가 오버라이딩 되어야한다.
    override  fun f() = println("C Class f()")

    fun test(){
        f()
        b()
        //super에 브라켓(<>)을 사용하여 구분을 짓도록 한다.
        super<A>.f()
        super<B>.f()
    }
}

fun main() {
    val c =C()
    c.test()
}