package org.example.Factory;

import org.example.Button.Button;
import org.example.Checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
