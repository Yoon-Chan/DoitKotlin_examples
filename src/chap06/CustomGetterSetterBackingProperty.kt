package chap06

class User3(_id :Int, _name:String, _age:Int){
    val id:Int = _id
    private  var tempName:String? = null
    var name:String = _name
        get() {
            if(tempName == null) tempName = "NONAME"
            return tempName ?: throw  AssertionError("Asserted by others")
        }

    var age:Int = _age

}

fun main() {
    val User1 = User3(1, "kildong", 35)
    User1.name = ""
    println("user1.name = ${User1.name}")
}