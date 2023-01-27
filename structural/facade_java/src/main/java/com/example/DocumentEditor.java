package com.example;

/**
 * Clients use this Class without needing to undetstanding the implementation of Document class
 */
public class DocumentEditor {
    private Document document;


    public DocumentEditor() { 
        document = new Document();
    }
    public void setText(String text) { 
        document.text = text;

    }
    public void setFont(String font) { 
        document.font = font;

    }
    public void setSize(int size) { 
        document.size = size;

    }
    public void setImage(String image) { 
        document.image = image;
    }
    public void save() { 
        document.save();
    }
}
