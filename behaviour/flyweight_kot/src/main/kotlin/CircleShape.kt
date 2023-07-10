class CircleShape(private val radius: Int): Shape {
    override fun draw() {
       println("Drawing a circle with radius $radius")
    }
}