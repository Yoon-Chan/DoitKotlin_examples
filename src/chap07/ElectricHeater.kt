package chap07

class ElectricHeater(var heating:Boolean = false): Heater{
    override fun off() {

        heating = false
    }

    override fun on() {
        println("[ElectricHeater] heating...")
        heating = true
    }

    override fun isHot(): Boolean = heating

}