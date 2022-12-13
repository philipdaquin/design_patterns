package com.example.factory;

import com.example.button.Button;
import com.example.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new HtmlButton();
    }
    
}
