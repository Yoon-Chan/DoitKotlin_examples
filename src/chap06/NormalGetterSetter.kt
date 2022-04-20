package chap06

//field는 프로퍼티를 참조하는 변수. 보조필드라고도 합니다.
//value 세터의 매개변수로 외부로부터 값을 가져옴
class User(_id: Int, _name:String, _age:Int){
    val id:Int = _id
        get() = field

    var name:String =_name
        get() = field

    set(value){
        //여기서 field는 this.name이 된다. 즉 this.name=value
        field= value
    }

    var age: Int = _age
    get()=field
    set(value){
        // age =value라고 하게되면 자바로 변환하게 되어 this.setname(value) 형태가 됨
        //이는 StackOverFlowError가 발생하게 됩니다. 지속적으로 setName을 호출하기 때문에.
        field =value
    }
}

fun main() {
    val user1 = User(1,"Kildong", 30)
    //user1.id = 2 //변경 불가
    user1.age = 35// 세터
    println("user1.age = ${user1.age}")

}