package com.example;

import com.example.factory.Dialog;
import com.example.factory.HtmlDialog;
import com.example.factory.WindowsDialog;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Dialog dialog;
    public static void main( String[] args )
    {
        configure();
        runBusinessLogic();
        System.out.println( "Hello World!" );
    }
    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options
     */
    static void configure() { 
        if (System.getProperty("os.name").equals("Windows 11")) { 
            dialog = new WindowsDialog();
        }  else {
            dialog = new HtmlDialog();
        }
    }
    /**
     * 
     */
    static void runBusinessLogic() { 
        dialog.renderWindow();
    }
}
