package chap03.section1


fun main(){
    //두개가 같다.
    twoLambda({a,b -> "First $a $b"}, {"Second $it"})
    twoLambda({a,b -> "First $a $b"}) {"Second $it"}
}

fun twoLambda(first: (String, String)->String, second:(String)->String){
    println(first("OneParam", "Twoparam"))
    println(second("OneParam"))
}