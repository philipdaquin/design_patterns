

/*
*   Bridge
*   - Decouples an abstraction from its implementation, allowing both to vary independently
*   It is used when you have a hierarchy of abstractions and a hierarchy of implementations,
*   and you want to avoid a permanent  binding between them
*
*   - By separating the abstraction from its implementation, the Bridge pattern allows both
*   to evolve independently.
*
*   - You can introduce new abstractions or implementations without affecting other, and you can also modify existing
*   ones without requiring changes in the other
*/

interface ShapeImpl {
    fun drawShape()
}

abstract class Shape(protected val impl: ShapeImpl) {
    abstract fun draw()
}

class CircleShape: ShapeImpl {
    override fun drawShape() {
        println("Drawing a circle")
    }
}
class SquareShape: ShapeImpl {
    override fun drawShape() {
        println("Drawing a square")
    }
}

class LargeShape(implementation: ShapeImpl): Shape(implementation) {
    override fun draw() {
        println("Drawing a  large shape")
        impl.drawShape()
    }
}

class SmallShape(impl: ShapeImpl): Shape(impl) {
    override fun draw() {
        println("Drawing a small shape ")
        impl.drawShape()
    }
}

fun main(args: Array<String>) {
    val circle = CircleShape(); val square = SquareShape()
    val largeShape = LargeShape(circle); val smallShape = SmallShape(square)

    largeShape.draw()
    smallShape.draw()
}