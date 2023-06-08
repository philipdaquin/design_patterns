package org.example;

/*
*   Builder Dsign pattern
*   - It separate the construction of an object from its representation, enabling
*       the same construction process to create different representation
* */





public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .crust("Crust")
                .sauce("sauce")
                .topping("TOPPINMG")
                .build();
        pizza.displayPizza();
    }
}