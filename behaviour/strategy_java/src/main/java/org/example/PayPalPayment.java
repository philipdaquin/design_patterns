package org.example;

public class PayPalPayment implements PaymentStrategy {
    public String email;
    public String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying with Paypal");
    }
}
