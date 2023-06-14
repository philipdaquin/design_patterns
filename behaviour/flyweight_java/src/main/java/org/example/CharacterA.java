package org.example;

public class CharacterA implements Character {

    private String symbol;

    public CharacterA(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public void display() {
        System.out.println(symbol);
    }
}
