package chap07

class MyDripCoffeModule: CoffeModule{
    companion object{
        val electricHeater : ElectricHeater by lazy{    //지연 초기화 사용
            ElectricHeater()
        }
    }
    private val _thermosiphon : Thermosiphon by lazy {
        Thermosiphon(electricHeater)
    }

    //오직 이 메서드에서만 Thermosiphon을 초기화
    override fun getThermosiphon(): Thermosiphon = _thermosiphon
}