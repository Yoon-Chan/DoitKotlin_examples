package chap06

/*
    by를 이용한 위임

    <val | var| class> 프로퍼티 혹은 클래스 이름 : 자료형 by 위임자.
    위임이란 프로퍼티의 게터와 세터를 특정 객체에게 위임하고 그 객체가 값을 읽거나 쓸 때 수행하도록
    만드는 것을 의미.
    무분별한 상속에 따른 복잡한 문제를 방지할 수 있다.


    observable() 함수와 vetoable() 함수의 위임
    두 함수를 사용하려며 Delegates를 임포트해야한다.
    import kotlin.properties.Delegates


    캠패니언
    코틀린은 정적변수를 사용할 때 static 키워드가 없는 대신 컴패니언 객체를 제공
    자바처럼 특정 클래스 이름의 프로퍼티로 객체를 생성하지 않고 접근한다고 가정

    자바가 코틀린 파일 클래스 접근하기 위한 방법(컴패니언 접근)
    ex)
    코틀린 파일에서
    class KCustomer{
        compainon object{
            const val LeVEL = "INTERMER"
            @JvmStatic fun login() = println("Logein...") //애노테이션 표기 사용
        }
    }

    자바에서
    객체 접근 -> KCustomer.LeVEL
    애노테이션 접근 방법 ->  KCustomer.login()
    애노테이션 사용 하지 않을 떄  -> KCustomer.Compainon.login()
 */