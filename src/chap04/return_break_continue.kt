package chap04

/*
*   흐름 제어문
*   return: 함수에서 결과값을 반환하거나 지정된 라벨로 이동.
*   break : for문이나 while문의 조건식에 상관없이 반복문을 끝낸다.
*   continue : for문이나 while문의 본문을 모두 수행하지 않고 다시 조건식으로 넘긴다.
*
*
*   예외 처리문
*
*   try{...}catch{...}: try 블록의 본문을 수행하는 도중 예외가 발생하면
*   catch블록의 본문을 실행한다.
*
*   try{...}catch{...}finally{...} 예외가 발생해도 finally블록 본문은 항상 실행.
*
*   람다식에서 라벨과 함께 return 사용하기
*   람다식 함수 이름 라벨 이름@{
*       ...
*       return@라벨이름
*   }
*
*   암묵적으로 라벨을 쓰는 방법
*   ex)
*   inllineLambda(13,3) {a,b ->
*       val res = a+b
*       if(res >10) return @inlineLambda
*       println ...
*    }
*   이렇게 자기 이름으로 암묵적 라벨을 사용할 수 있다
* */

fun main() {
    //ex9() //inline을 사용한 람다식 반환.
    ex10()//람다식에서 라벨과 함께 return 사용하기
}

fun ex9(){
    retFunc()
}
fun ex10(){
    retFUnc2()
}

fun noinlineLambda(a:Int, b:Int, out:(Int,Int)->Unit){
    out(a,b)
}

fun retFUnc2(){
    println("start of retFunc")
    noinlineLambda(13,3) lit@{ a,b->
        val result = a+b
        if(result > 10) return@lit  //라벨을 사용한 끝부분으로 반환
        println("result : $result")
    }                               //즉 여기로 빠져나간다.

    //익명함수로 사용할 경우
    /*
    * noinlineLambda(13,3, fun(a,b){
    *   val result = a+b
        if(result > 10) return
        println("result : $result")
    * })
    *
    *
    * */
    println("end of retFunc")
}

inline fun inlineLambda(a:Int, b:Int, out:(Int,Int)->Unit){
    out(a,b)
}
fun retFunc(){
    println("start of retFunc")
    inlineLambda(13,3){
        a,b ->
        var result = a+b
        if(result>10) return
        println("result: $result")
    }
    println("end of retFunc")
}