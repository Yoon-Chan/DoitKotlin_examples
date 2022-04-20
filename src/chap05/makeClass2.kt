package chap05
//주 생성자 만들기
class Bird2 constructor(_name:String, _wing:Int, _beak:String, _color:String){
    //프로퍼티(속성)
    var name:String =_name
    var wing :Int  =_wing
    var beak:String = _beak
    var color :String   = _color



    //메서드 함수
    fun fly(){
        println("Fly wing: $wing")
    }
    fun sing(vol:Int) = println("Sing vol: $vol")
}
