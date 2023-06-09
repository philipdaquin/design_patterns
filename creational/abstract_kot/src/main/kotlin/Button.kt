interface Button {
    fun render()
}

class WindowsButton: Button {
    override fun render() {
        println("Rendering a button in windows styles")
    }
}

class MacButton: Button {
    override fun render() {
        println("Rendering a button in mac styles")
    }
}
