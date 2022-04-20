package chap05

import kotlin.math.sin

class Bird{ //클래스 정의
    //프로퍼티(속성)
    var name:String
    var wing :Int
    var beak:String
    var color :String

    //부 생성자 만들기
    constructor(name: String, wing:Int, beak:String, color:String){
        this.name =name
        this.wing = wing
        this.beak = beak
        this.color= color
    }

    //두 번째 부 생성자 만들기
    constructor(_name:String, _beak:String){
        name=_name
        wing =2
        beak =_beak
        color = "grey"
    }

    //메서드 함수
    fun fly(){
        println("Fly wing: $wing")
    }
    fun sing(vol:Int) = println("Sing vol: $vol")
}
