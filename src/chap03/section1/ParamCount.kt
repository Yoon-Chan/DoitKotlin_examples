package chap03.section1

fun main() {
    //매개변수 없는 람다식
    noParam ( {"Hello World!" })
    noParam { "Hello World!" }  //위에 결과 와 동일 소가로 생략 가능

    //매개변수가 한개 있는 경우
    oneParam { a-> "Hello World $a" }
    oneParam ({ a-> "Hello World $a" })
    oneParam { "Hello World $it" }  //위와 동일한 결과 it으로 대체 가능

    //람다식의 매개변수가 2개 이상인 경우 $it을 사용해 변수를 생략할 수 없다.
    moreparam({ a,b -> "Hello World! $a $b"})
    moreparam { a, b -> "Hello World! $a $b"  }
    moreparam { _, b -> "Hello World! $b"  } //첫번쨰 매개변수를 생략할 때

    //일반 매개변수와 람다식 매개변수를 같이 사용하기.
    withArgs("Arg1","Arg2", {a,b->"Hello World! $a $b"})
    withArgs("Arg1", "Arg2") {a,b -> "Hello World! $a $b"}
}

fun noParam(out: ()-> String) = println(out())

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun moreparam(out: (String, String)->String){
    println(out("oneParam", "TwoParam"))
}

fun withArgs(a:String, b:String, out:(String, String)->String){
    println(out(a,b))
}
