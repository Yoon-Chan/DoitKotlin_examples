package chap06

import java.util.*

class User2(_id:Int, _name:String, _age:Int){
    val id: Int = _id
    var name:String = _name
        set(value) {
            println("The name was changed")
            field = value.uppercase()
        }

    var age:Int = _age
        private set //이런 경우 age는 외부에서 프로퍼티에 값을 할당 할 수 없다.


}

fun main() {
    var user1 = User2(1,"Kildong", 35)
    user1.name = "coco"
    println("user1.name = ${user1.name}")
}