


/*
*   Proxy design pattern provides a surrogate or placeholder for another object to control access to it
*
*   - It allows you to create a substitute or representative object that can interact with the original object
*       and provide additional functionality or control over its behaviour
*
*   - Proxy acts as an intermediary between the client and the real object, allowing the client to communicate with the
*       real object, so the client can treat the proxy object as if it were the real objecrt
*
* */

interface Image {
    fun display()
}

class RealImage(
    private val fileName: String
): Image {
    init {
        loadFromDisk()
    }
    private fun loadFromDisk() {
        println("Loading Image: $fileName")
    }

    override fun display() {
        println("Displaying Image: $fileName")
    }
}

class ImageProxy(private val fileName: String) : Image {
    private var realImage: RealImage? = null
    override fun display() {
        if (realImage == null) realImage = RealImage(fileName)
        realImage?.display()
    }
}


fun main(args: Array<String>) {
    val img1: Image = ImageProxy("Image.png")
    val img2: Image = ImageProxy("Image2.png")

    img1.display()
    img2.display()
}