package org.example.dependency_inversion.dip;

public class PaymentProcessor {
    private ILogger logger;

    public PaymentProcessor(ILogger logger) {
        this.logger = logger;
    }
}
