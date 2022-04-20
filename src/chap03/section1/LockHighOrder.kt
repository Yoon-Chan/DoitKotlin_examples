package chap03.section1

import java.util.concurrent.locks.ReentrantLock

var sharable= 1 //보호가 필요한 공유 자원

fun main() {
    val reLock = ReentrantLock()

    lock(reLock, {criticalFunc()})
    lock(reLock) {criticalFunc()}
    lock(reLock, ::criticalFunc)

    println(sharable)
}

fun criticalFunc(){
    //공유자원 접근 코;드 사용
    sharable +=1
}

fun <T> lock(relock : ReentrantLock, body: ()->T):T{
    relock.lock()
    try {
        return body()
    }finally {
        relock.unlock()
    }
}