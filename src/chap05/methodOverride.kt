package chap05

open class Bird6(var name:String, var wing:Int, var beak:String, var color:String){


    //메서드 함수
    fun fly(){
        println("Fly wing: $wing")
    }
    //open을 사용하면 하위 클래스에서 오버라이딩 가능
    open fun sing(vol:Int) = println("Sing vol: $vol")
}

//부 생성자 상속
class Parrot2(name:String, wing:Int=2, beak:String, color:String,var language:String="natural")
    :Bird6(name, wing, beak, color){

    fun speak() =println("Speak! : $language")
    //오버라이딩된 메서드
    override fun sing(vol:Int){
        println("I'm a parrot! The volume level is $vol")
        speak()
    }
}

fun main() {
    val parrot = Parrot2(name = "myparrot", beak = "short", color = "multiple")
    parrot.language="English"

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}," +
            "${parrot.language}")

    parrot.sing(5)
}