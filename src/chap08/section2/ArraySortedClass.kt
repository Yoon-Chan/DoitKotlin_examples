package chap08.section2

data class Product2(val name: String, val price : Double)

fun main(){
    val products2 = arrayOf(
        Product2("Snow Ball", 870.00),
        Product2("Smart Phone", 999.00),
        Product2("Drone", 240.00),
        Product2("Mouse", 333.55),
        Product2("Keyboard", 125.99),
        Product2("Monitor", 1500.99),
        Product2("Tablet", 512.99)
    )

    products2.sortBy { it.price }
    products2.forEach { println(it) }

}