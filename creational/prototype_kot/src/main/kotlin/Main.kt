
/*
*   The Prototype design pattern enables the creation of objects by cloning or
*   copying existing objects, known as prototypes, rather than creating new instances from scratch
*
*   Typically involves the following key things:
*  - Prototype
*  - Concrete Prototype
*  - Client
* */

interface Prototype {
    fun clone(): Prototype
}

class ConcretePrototype(private val data: String) : Prototype {
    override fun clone(): Prototype {
        return ConcretePrototype(data)
    }
    fun printData() {
        println("Date: $data")
    }
}




fun main(args: Array<String>) {
    val prototype = ConcretePrototype("DATA")

    prototype.printData()
    var clonedType= prototype.clone() as ConcretePrototype
    prototype.printData()

}


























