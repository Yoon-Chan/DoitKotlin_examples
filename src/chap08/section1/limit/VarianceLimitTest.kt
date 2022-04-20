package chap08.section1.limit

open class Animal(val size: Int){
    fun feed() = println("Feeding...")
}

class Cat(val jump:Int): Animal(50)
class Spider(val position: Boolean): Animal(1)

class Box<out T:Animal>(val element:T){
    fun getAnimal(): T =element
//    fun set(new: T){
//        element= new
//    }


}

fun main(){
    // 일반적인 객체 선언
    val c1:Cat = Cat(10)
    val s1:Spider= Spider(true)

    var a1: Animal = c1
    a1 = s1 // a1은 spider 객체가 됨
    println("a1.size = ${a1.size}")

    val c2:Box<Animal> = Box<Cat>(Cat(10))
    println("c2.element.size = ${c2.element.size}")

    //val c3: Box<Cat> = Box<Animal>(10) 오류.
    //val c4 : Box<Any> = BOx<Int>(10) 오류.

}