package org.example;

import java.util.HashMap;

public class CharacterFactory {
    private HashMap<String, Character> symbolPool;

    public CharacterFactory() {
        symbolPool = new HashMap<>();
    }

    public Character getSymbol(String symbol) {
        if (symbolPool.containsKey(symbol)) {
            return symbolPool.get(symbol);
        }
        Character newSymbol = new CharacterA(symbol);
        symbolPool.put(symbol, newSymbol);
        return newSymbol;
    }
}
