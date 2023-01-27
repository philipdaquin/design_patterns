package com.example;

/*
 * DocumentEditor class acts as a facade for the Document class
 * - Providing a simplified interface for creating and editing documnets
 * - The Document Editor class has methods setting the text, font, size 
 *  and inserting  an image and saving the document 
 * 
 * - Client use the methods of the DocumentEditor class to create and edit document
 *  without needing to understand the implementation details of the Document class
 */


public class Document {
    public String text;
    public String font; 
    public int size;
    public String image;
    
    public void setText(String text) { 
        this.text = text;

    }
    public void setFont(String font) { 
        this.font = font;

    }
    public void setSize(int size) { 
        this.size = size;

    }
    public void setImage(String image) { 
        this.image = image;
    }
    public void save() { 
        System.out.println("Document saved with text: " + text);
        System.out.println("Font: " + font + " Size: " + size);
        System.out.println("Image: " + image);
    }
}
