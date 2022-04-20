package chap08.section2

import java.util.*

fun main(){
    val arr = arrayOf(8,4,3,2,5,9,1)

    //오름차순
    val sortedNums = arr.sortedArray()
    println("ASC : "+ Arrays.toString(sortedNums))

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DEC : "+ Arrays.toString(sortedNumsDesc))

    //원본 배열에 대한 정렬
    arr.sort(1,3)
    println("ORI : "+ Arrays.toString(arr))
    arr.sortDescending()
    println("ORI : "+Arrays.toString(arr))

    //리스트로 변환
    val listSorted: List<Int> = arr.sorted()
    val listDec : List<Int> = arr.sortedDescending()

    println("LST : "+ listSorted)
    println("LST: "+ listDec)

    //sortBy를 이용한 특정 표현식에 따른 정렬
    val items = arrayOf<String>("Dog", "Cat","Lion","Kangaroo","Po")
    items.sortBy { item -> item.length }
    println(Arrays.toString(items))

}