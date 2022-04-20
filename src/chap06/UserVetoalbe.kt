package chap06

import kotlin.properties.Delegates

fun main() {
    var max : Int by Delegates.vetoable(0)  //초기값은 0
    {
        prop, old, new ->
        new > old
    }

    println(max)
    max = 10
    println(max)

    max = 5 //여기는 새 값이 더 크므로 재할당 되지 않음
    println(max)
}