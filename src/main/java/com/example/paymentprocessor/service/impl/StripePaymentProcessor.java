package com.example.paymentprocessor.service.impl;

import com.example.paymentprocessor.service.PaymentProcessor;

public class StripePaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount, String currency) {
        System.out.printf("Processing payment via Stripe. Amount: %f, currency: %s%n", amount, currency);
    }
}
