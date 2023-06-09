


public interface TextBox {
    fun render()
}

class WindowsTextBox: TextBox {
    override fun render() {
        print("Rendering a text box in windows style")
    }
}

class MacTextBox: TextBox {
    override fun render() {
        println("Rendering a text box in Mac style")
    }
}