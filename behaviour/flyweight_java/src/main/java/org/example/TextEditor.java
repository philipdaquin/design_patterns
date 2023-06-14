package org.example;

public class TextEditor {
    private CharacterFactory characterFactory;

    public TextEditor() {
        characterFactory = new CharacterFactory();
    }

    public void displayText(String text) {
        Character newChar = characterFactory.getSymbol(text);

        newChar.display();

        System.out.println();
    }
}
