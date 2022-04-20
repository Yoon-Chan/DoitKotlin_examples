package chap04

/*
*   for문의 기본형
*   for(요소변수 in 컬렉션 또는 범위) { 반복할 본문}
*
*   for( x in 1..5){ println(x) }
*   한줄인 경우 중괄호 생략 가능.
*
* */

fun main() {
    //ex4() //1부터 10까지 더하기.
    //ex5() //반복문을 이용하여 삼각형 출력하기.

    //ex6()//짝수의 합과 홀수의 합 구하기
    //ex7() //while문으로 팩토리얼 계산하기.
    ex8()//do while 사용해보기
}

fun ex4(){
    var sum =0;
    for(x in 1..10){
        // in 10..1인경우 실행이 안됨
        // 10,9,8 .. 하고 싶은 경우 in 10 downTo 1 이렇게 하면 됨.
        // 2칸씩 이동하고 싶은경우 step을 사용 in 1..5 step 2
        // 2칸씩 내려가고 싶은 경우 in 10 downTo 1 step 2 이렇게 작성.
        sum+=x
    }
    println("Sum : $sum")
}
fun ex5(){
    print("Enter the lilnes: ")
    val n = readLine()!!.toInt()

    for(line in 1..n){
        for (space in 1..(n-line)) print(" ")
        for (star in 1..(2*line-1)) print("*")
        println()
    }
}
fun ex6(){
    var total: Int = 0
    for(num in 1..100 step 2) total +=num
    println("Odd total : $total")

    for(num in 0..99 step 2) total+=num
    println("Evne total : $total")
}
fun ex7(){
    print("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1
    while(number>0){
        factorial *=number
        number--;
    }

    println("Factorial: $factorial")
}
fun ex8(){
    do {
        print("Enter an inteager: ")
        val input = readLine()!!.toInt()

        for(i in 0..(input-1)){
            for(j in 0..(input-1)) print((i+j)%input+1)
            println()
        }
    }while (input!=0)
}