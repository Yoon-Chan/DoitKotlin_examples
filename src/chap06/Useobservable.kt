package chap06

import kotlin.properties.Delegates

class User4{
    var name: String by Delegates.observable("NONAME"){ //프로퍼티 위임
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val user = User4()
    user.name = "Kildong"
    user.name = "Dolly"
}