package com.example;

public abstract class FIleProcessor {
    

    public final void processFile(String fileName) { 
        openFile(fileName);
        readFile();
        processData();
        closeFile();

    }

    public void processData() {

        System.out.print("Processing File!");
    }

    public void closeFile() {
        System.out.print("Processing File!");

    }

    public void readFile() {
        System.out.print("Processing File!");

    }

    public void openFile(String fileName) {
        System.out.print("Processing File!");

    }

    
}
