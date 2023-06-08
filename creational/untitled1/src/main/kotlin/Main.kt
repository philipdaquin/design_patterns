
interface Product {
    fun doSomething()
}

class ProductClass: Product {
    override fun doSomething() {
        println("Doing something in ProductClass ")
    }
}

class ProductClassB: Product {
    override fun doSomething() {
        println("Doing Something in Product class B")
    }
}


class ProductFactory {
    fun createProduct(value: String): Product? {
        return when (value) {
            "Product" -> ProductClass()
            "ProductB" -> ProductClass()
            else -> null
        }
    }
}


fun main(args: Array<String>) {

    var productFactory = ProductFactory()
    var product = productFactory.createProduct("Product")


    println(product)
}