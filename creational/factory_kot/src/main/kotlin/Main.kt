
/*
*   The Factory Design pattern is a creational design pattern that provides an interface for creating objects, but allows
*   subclasses to decide which class to instanstiate
*
* */

interface Product {
    fun operation(): String
}

class ConcreteProductA: Product {
    override fun operation(): String {
        return "concreteA operation"
    }
}

class ConcreteProductB: Product {
    override fun operation(): String {
        return "Concrete Product B operation"
    }
}

interface Factory {
    fun createProduct(): Product
}
class ConcreteFactoryA: Factory {
    override fun createProduct(): Product {
        return ConcreteProductA()
    }
}


class ConcreteFactoryB: Factory {
    override fun createProduct(): Product {
        return ConcreteProductB()
    }
}


fun main(args: Array<String>) {
    val factory : Factory = ConcreteFactoryA()

    val product: Product = factory.createProduct()
    println(product.operation())



}