package org.example;

import org.example.Button.Button;
import org.example.Checkbox.Checkbox;
import org.example.Factory.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;


    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    public void renderUI() {
        button.render();
        checkbox.render();
    }


}
