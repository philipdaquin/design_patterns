interface Factory {
    fun createButton(): Button
    fun createTextBox(): TextBox
}

class WindowsGUIFactory: Factory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createTextBox(): TextBox {
        return WindowsTextBox()
    }
}

class MacGUIFactory: Factory {
    override fun createButton(): Button {
        return MacButton()
    }

    override fun createTextBox(): TextBox {
        return MacTextBox()
    }
}

