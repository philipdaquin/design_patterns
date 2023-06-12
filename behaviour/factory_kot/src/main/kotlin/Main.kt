

interface Shape {
    fun draw()

}

class Circle: Shape {
    override fun draw() {
        println("Drawing a circle")
    }
}

class Square: Shape {
    override fun draw() {
        println("Drawing a square")
    }
}
class ShapeFactory {
    fun createShape(shape: String): Shape? {
        return when(shape.lowercase()) {
            "circle" -> Circle()
            "square" -> Square()
            else -> null
        }
    }
}

fun main(args: Array<String>) {
    val factory = ShapeFactory()

    val circle = factory.createShape("circle")
    circle?.draw()

    val square = factory.createShape("square")
    square?.draw()



}