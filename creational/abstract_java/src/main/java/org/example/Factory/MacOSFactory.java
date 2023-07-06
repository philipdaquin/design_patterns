package org.example.Factory;

import org.example.Button.Button;
import org.example.Button.MacOSButton;
import org.example.Checkbox.Checkbox;
import org.example.Checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
