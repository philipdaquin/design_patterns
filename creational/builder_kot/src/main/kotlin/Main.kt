



class Pizza private constructor(builder: Builder) {

    private val crust: String = builder.crust
    private val sauce: String = builder.sauce
    private val topping: String = builder.topping

    fun display() {
        println("$crust, $sauce, $topping")
    }

    class Builder {
        var crust: String = ""
        var sauce: String = ""
        var topping: String = ""

        fun crust(crust: String): Builder {
            this.crust = crust
            return this
        }
        fun sauce(sauce: String): Builder {
            this.sauce = sauce
            return this
        }
        fun topping(topping: String): Builder {
            this.topping = topping
            return this
        }
        fun build(): Pizza {
            return Pizza(this)
        }
    }
}


fun main(args: Array<String>) {

    val pizza: Pizza = Pizza.Builder()
        .crust("CRUST")
        .sauce("SAUCE")
        .topping("TOPPING")
        .build();

    pizza.display()

    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}