package com.example.button;

public class HtmlButton implements Button {

    @Override
    public void render() {
        // TODO Auto-generated method stub
        System.out.println("<button>HelloWorldButton</button>");
        onClick();
        
    }

    @Override
    public void onClick() {
        // TODO Auto-generated method stub
        System.out.println("Click! button says = 'Hello Wolrd!' ");
    }
    
}
