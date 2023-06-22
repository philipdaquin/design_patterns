

/*
*   Composite design pattern
*   - Allows you to compose objects into tree like structures to represent part whole
*     hierarchies
*
*   - It lets clients treat individual objects and compositions of objects uniformly
*
*   - The key idea behind the Composite pattern is that you can use the same operations or methods to
*    to manipulate individuals objects as well as collections of object
*
* */

interface Employee {
    fun getName(): String
    fun getSalary(): Double
    fun print()

}

class Developer(
    private val name: String,
    private val salary: Double,
): Employee {

    override fun getName(): String {
        return name
    }

    override fun getSalary(): Double {
        return salary
    }

    override fun print() {
        println("Developer: $name, Salary: $salary")
    }
}

class Manager(
    private val name: String,
    private val salary: Double
) : Employee {

    private val subordinates: MutableList<Employee> = mutableListOf()

    fun addEmployee(employee: Employee) {
        subordinates.add(employee)
    }

    fun removeEmployee(em: Employee) {
        subordinates.remove(em)
    }

    override fun getName(): String {
        return name
    }

    override fun getSalary(): Double {
        return salary
    }

    override fun print() {
        println("Developer: $name, Salary: $salary")
    }
}


fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}