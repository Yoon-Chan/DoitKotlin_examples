package chap05

//상속 가능한 클래스 만들기 open키워드
open class Bird5(var name:String, var wing:Int, var beak:String, var color:String){
    //메서드 함수
    fun fly(){
        println("Fly wing: $wing")
    }
    fun sing(vol:Int) = println("Sing vol: $vol")
}

//주 생성자 상송
class Lark(name:String, wing:Int, beak:String, color:String):Bird5(name,wing,beak,color)
{
    fun singHiton() = println("Happy Song!")    //새로 추가한 메서드
}

//부 생성자 상속
class Parrot :Bird5{
    val language :String
    constructor(name:String, wing:Int, beak:String, color:String,language:String)
    :super(name,wing,beak,color){
        this.language = language
    }

    fun speak() =println("Speak! : $language")
}

fun main() {
    val coco = Bird5("mybird", 2, "short", "blue")
    val lark = Lark("mylark", 2, "long", "brown")
    val parrot = Parrot("myparrot", 2, "short","multiple", "korean")

    println("Coco : ${coco.name}, ${coco.beak}, ${coco.wing}, ${coco.color}")
    println("Lark : ${lark.name}, ${lark.beak}, ${lark.wing}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.beak}, ${parrot.wing}, ${parrot.color}," +
            "${parrot.language}")

    lark.singHiton()
    parrot.speak()
    lark.fly()
}
