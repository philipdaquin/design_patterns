


/*
*   The Abstract Factory pattern
*   - Provides an interface for creating families of related or dependent objects
*   without specifying their concrete classes
*   - It allows you to create objects that are related and designed to work together,
*       without tying your code to a specific implementation
*
* */



class Application(private val factory: Factory) {
    private lateinit var button: Button
    private lateinit var textBox: TextBox

    fun createUI() {
        button = factory.createButton()
        textBox = factory.createTextBox()
    }

    fun renderUI() {
        button.render()
        textBox.render()
    }
}

fun main(args: Array<String>) {
    val wFactory = WindowsGUIFactory()
    val windowsApp = Application(wFactory)
    windowsApp.createUI()
    windowsApp.renderUI()

    val macFactory = MacGUIFactory()
    val macApp = Application(macFactory)
    macApp.createUI()
    macApp.renderUI()
}