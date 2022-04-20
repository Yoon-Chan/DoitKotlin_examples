package chap05

class Bird4 (var name:String = "NONAME"/*미리 값을 지정 가능*/, var wing:Int, var beak:String, var color:String){

    init {
        println("-------초기화블록-------")
        println("이름은 $name, 부리는 $beak. 색은 $color")
        this.sing(3)
        println("-------초기화블록 끝-------")
    }

    //메서드 함수
    fun fly(){
        println("Fly wing: $wing")
    }
    fun sing(vol:Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird4("mybird", 2, "short", "blue")
    coco.color = "yellow"
    //초기화 블록이 먼저 나온 후 아래화면 출력
    println("coco.color = ${coco.color}")
    coco.fly()
}