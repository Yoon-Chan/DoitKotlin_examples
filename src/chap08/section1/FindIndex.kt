package chap08.section1

//배열의 인덱스 찾아내기

fun <T> find(a: Array<T>, Target: T): Int{
    for (i in a.indices){
        if(a[i]==Target) return i
    }
    return -1
}

fun main(){
    val arr1:Array<String> = arrayOf("Apple", "banana","Cherry","Durian")
    val arr2: Array<Int> = arrayOf(1,2,3,4)

    //indices는  배열의 유효 번위를 반환.
    println("arr.indices ${arr1.indices}")
    println(find<String>(arr1, "Cherry"))
    println(find<Int>(arr2, 2))
}