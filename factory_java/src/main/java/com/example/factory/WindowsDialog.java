package com.example.factory;

import com.example.button.Button;
import com.example.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new WindowsButton();
    }
    
}
