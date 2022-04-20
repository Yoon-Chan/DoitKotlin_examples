package chap05
//주 생성자 만들기2 :간략화
class Bird3(var name:String, var wing:Int, var beak:String, var colo:String){


    //메서드 함수
    fun fly(){
        println("Fly wing: $wing")
    }
    fun sing(vol:Int) = println("Sing vol: $vol")
}
