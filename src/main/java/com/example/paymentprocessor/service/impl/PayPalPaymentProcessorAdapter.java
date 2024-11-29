package com.example.paymentprocessor.service.impl;

import com.example.paymentprocessor.service.PaymentProcessor;
import com.example.paypal.PayPalPaymentService;

public class PayPalPaymentProcessorAdapter implements PaymentProcessor {
    private final PayPalPaymentService payPalPaymentService;

    public PayPalPaymentProcessorAdapter(PayPalPaymentService payPalPaymentService) {
        this.payPalPaymentService = payPalPaymentService;
    }

    @Override
    public void processPayment(double amount, String currency) {
        payPalPaymentService.sendPayment(amount, currency);
    }
}
