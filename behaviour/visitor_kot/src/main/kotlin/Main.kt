
/*
*   Visitor Design Pattern
*   - Allows you to add new operations or algorithms to a set of objects without modifying their structure
*      It separates the algorithm or operation from the objects on which it operates
*
*   The main idea behind is to define  a new operation that can be applied to a group of objects.
* */

interface AnimalVisitor {
    fun visit(lion: Lion)
    fun visit(tiger: Tiger)
    fun visit(elephant: Elephant)
}
abstract class Animal {
    abstract fun accept(visitor: AnimalVisitor)
}

class Lion: Animal() {
    override fun accept(visitor: AnimalVisitor) {
        visitor.visit(this)
    }
}

class Tiger: Animal() {
    override fun accept(visitor: AnimalVisitor) {
        visitor.visit(this)
    }
}

class Elephant: Animal() {
    override fun accept(visitor: AnimalVisitor) {
        visitor.visit(this)
    }
}

class LegCountVisitor: AnimalVisitor {
    private var count = 0 ;
//    val lionLeg = 4
//    val elephantLeg = 4
//    val tigerLeg = 4
//
    fun getTotal(): Int {
        return count
    }

    val totalLegs: Int
        get() = count


    override fun visit(lion: Lion) {
        count += 4
    }

    override fun visit(elephant: Elephant) {
        count += 4

    }

    override fun visit(tiger: Tiger) {
        count += 4

    }
}




fun main(args: Array<String>) {

    val animals : Array<Animal> = arrayOf(Lion(), Tiger(), Elephant())

    val counter = LegCountVisitor()

    for (animal in animals) {
        animal.accept(counter)
    }


    val total = counter.getTotal()
    println("total legs: $total")


}