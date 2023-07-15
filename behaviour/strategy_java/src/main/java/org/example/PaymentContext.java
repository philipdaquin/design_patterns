package org.example;

// Create the context class
// The Context is the class that maintains a reference to a specific strategy object
// It provides a method for client set or switch the current strategy at runtime
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentContext(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;

    }
    public void processPayment(int amount) {
        this.paymentStrategy.pay(amount);
    }

}
