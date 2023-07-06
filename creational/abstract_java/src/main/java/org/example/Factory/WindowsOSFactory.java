package org.example.Factory;

import org.example.Button.Button;
import org.example.Button.WindowsButton;
import org.example.Checkbox.Checkbox;
import org.example.Checkbox.WindowsCheckbox;

public class WindowsOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
