package com.example.factory;

import com.example.button.Button;

/**
 * Base Factory Class 
 */
public abstract class Dialog {
    
    public void renderWindow() { 
        Button button = createButton();

        button.render();
    }

    /**
     * Subclasses will override thsi method in order to create 
     * specific button objects
     * @return
     */
    public abstract Button createButton();
}
