package chap03.section1

fun main() {
    shortFunc(3) {x->println("First Call: $x")}
    shortFunc(5, {println("First Call: $it")})

    shortFunc2(4){println("First call $it")}
}

inline fun shortFunc(a:Int, out: (Int)->Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

// noinline으로 람다식의 인라인 막기
inline fun shortFunc2(a:Int, noinline out:(Int)->Unit){
    println("noinline :Before calling out()")
    out(a)
    println("noinline : After calling out()")
}