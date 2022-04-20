package chap02.section2

fun main(){
    val number =10 // int형으로 추론됨
    var language = "Korean" // String으로 추런
    val secondNumber: Int= 20 //int형으로 명시적으로 지정
    language = "English"    //var 키워드로 선언하면 변수는 값을 다시 할당할 수 없음

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")

    /*
    * 코틀링 정수 자료형
    *
    * Long      8바이트(64비트)
    * Int       4바이트(32비트)
    * Short     2바이트(16비트)
    * Byte      1바이트(8비트)
    * */

    val exp0 = 123 //int형으로 추론
    val exp02 = 123L // Long형으로 추런
    val exp03 = 0x0F // F는 16진 표기가 사용된 Int형으로 추론
    val exp04 = 0b00001011 // 0b를 사용해 2진 표기가 사용된 Int형으로 추론

    //보통 숫자값은 Int형으로 추론되기 때문에 만일 좀 더 작은 범위의 정수 자료형인 Byte형이나
    //Short형을 사용하기 위해서는 다음과 같이 직접 자료형을 명시.
    val exp08:Byte =127

    /*
    *  부호가 없는 정수 자료형
    * ULong     8바이트(64비트)
    * UInt      4바이트(32비트)
    * UShort    2바이트(16비트)
    * UByte     1바이트(8비트)
    * */

    val uint:UInt = 153u
    val ushort : UShort =65535u
    val ulong: ULong = 46422342uL
    val ubyte : UByte = 255u

    //언더스코어를 이용하여 식별을 용이하게 가능
    val numberunder = 1_000_000


    /*
    * 실수 자료형
    * Double        8바이트(64비트)
    * Float         4바이트(32비트)
    * */
    val exp10 = 3.14 // Double형
    val exp11 = 3.14F // Float형
    val exp12 = 3.14E-2 // 0.0314
    val exp13 = 3.14e2 // 314

    /*
    * 논리 자료형 Boolean  1비트
    * */
    val isOpen = true
    val isUploaded : Boolean //선언만 한 경우 자료형 명시 꼭 하기.

    /*
    * 문자 자료형 Char 2바이트(16비트)
    * */

    val ch = 'c'
    var ch2:Char // 선언만 한 경우 자료형 명시 꼭 하기.
    //val chNumb:Char = 65 //이는 오류 숫자로 사용하여 선언하는 것은 금지
    println(ch + 1) //하지만 문자열에 숫자를 더한 값은 사용 가능
    //숫자를 문자형으로 바꾸는 방법 toChar()
    val code: Int = 65
    val chFromCode : Char =code.toChar()

    var str1:String="Hello"
    var str2 = "world"
    var str3 = "Hello"
    println("str1==str2 : ${str1==str2}") //false
    println("str1==str3 : ${str1==str3}") // true

    //형식화된 다중 문자열 출력하기
    val num = 10
    var formattedString ="""
       var a=6 
       var b= "Kotlin"
       println(a+num) // num의 값은 $num
    """
    println(formattedString)


    //null 처리하기
    var str11:String ="Hello Kotlin"
    // str11 = null //오류 발생

    //변수선언무에서 ?을 추가해야 null을 처리할 수 있다.
    var str12:String? = "Hello Kotlin"
    str12 = null
    //println("str12 : $str12 length : ${str12.length}") //null을 허용하면 length가 실행이 안댐
    println("str12 : $str12 length : ${str12?.length}") //str12를 세이프콜로 안전하게 호출

    //println("str12 : $str12 length : ${str12!!.length}") //단정 기호(!!)
    println("str12 : $str12 length : ${str12?.length ?: -1}") // ?:은 null인지 아닌지 판단
    //즉 str12?.length가 null이면 -1을 출력한다.



    //스마트 캐스트 사용해보기
    var test:Number = 12.2 //12.2에 의해 Float형으로 스마트 캐스트.
    println("$test") //12.2

    test = 12 //Int형으로 스마트 캐스트
    println("$test")
    test = 120L //Long형으로 스마트 캐스트
    test += 12.0f //Float형으로 스마트 캐스트
    println("$test")

    //자료형 검사하기
    println("\n\n자료형 검사하기 : is 키워드 사용")
    var nums= 256
    if(nums is Int){
        print(nums)
    }else if(nums !is Int){ // !(nums is Int)와 같은 표현
        print("Not a Int")
    }

    //Any형은 코틀린 최상위 기본 클래스로 어떤 자료형이라도 될 수 있는 특수한 자료형
    val xx:Any
    xx= "Hello"
    if(xx is String){
        print(xx.length) //xx는 자동적으로 String으로 스마트 캐스트
    }

    // as에 의한 스마트 캐스트
    // as로 스마트 캐스트 할 수 있다. as는 형 변환이 가능하지 않으면 예외를 발생시킵니다.

    // val xxx:String = y as String //y가 널이 아니면 String으로 형 변환되어 xxx에 할당.
    // val xxx:String? = y as? String // y가 null 까지 고려하여 예외 발생을 피하려면 다음과 같이 사용가능

}