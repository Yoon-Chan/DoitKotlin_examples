package chap05

open class Base{
    open val x:Int = 1
    open fun f() = println("Base Class f()")
}

class Child:Base(){
    override val x :Int = super.x+1
    override fun f() = println("Child Class f()")

    inner class Inside{
        fun f() = println("Inside Class f()")
        fun test(){
            f()         // 현재 이너클래서의 f()
            Child().f() // 바로 바깥 클래서 f()접근
            //아래는 Child의 super클래스, 즉 Base클래스를 의미
            super@Child.f() // Child의 상위 클래스인 Base클래스의 f()접근
            println("[Inside] super@Child.x : ${super@Child.x}")    //Base의 x 접근
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()
}