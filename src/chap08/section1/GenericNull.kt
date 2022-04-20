package chap08.section1

// 형식 매개변수에 null이 가능한 제네릭 클래스

class GenericNull<T>{
    fun EqualityFunc(arg1: T, arg2: T){
        println(arg1?.equals(arg2))
    }
}

fun main(){
    // null이 허용되지 않음
    val obj = GenericNull<String>()
    obj.EqualityFunc("hello", "world")

    //null이 허용됨
    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null, 10)

}