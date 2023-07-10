object ShapeFactory {
    private val circleMap = mutableMapOf<Int, Shape>()

    fun getCircle(radius: Int): Shape {
        return circleMap.getOrPut(radius) {
            CircleShape(radius)
        }
    }
}