package org.example;

public class Pizza {
    private String crust, sauce, topping;

    public static class Builder {
        private String crust, sauce, topping;

        public Builder crust(String crust) {
            this.crust = crust;
            return this;
        }
        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }

    }
    private Pizza(Builder builder) {
        this.crust = builder.crust;
        this.topping = builder.topping;
        this.sauce = builder.sauce;
    }

    public void displayPizza() {
        System.out.println(this.crust + "," + this.topping + "," + this.sauce);
    }

}














