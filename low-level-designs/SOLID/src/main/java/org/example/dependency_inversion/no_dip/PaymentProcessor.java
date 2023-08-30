package org.example.dependency_inversion.no_dip;

public class PaymentProcessor {
    private Logger logger;

    public PaymentProcessor() {
        this.logger = new Logger();
    }
}
