package com.example;

import com.example.paymentprocessor.service.PaymentProcessor;
import com.example.paymentprocessor.service.impl.PayPalPaymentProcessorAdapter;
import com.example.paymentprocessor.service.impl.StripePaymentProcessor;
import com.example.paypal.PayPalPaymentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final PayPalPaymentService payPalPaymentService = new PayPalPaymentService();

        final PaymentProcessor stripePaymentProcessor = new StripePaymentProcessor();
        final PaymentProcessor payPalPaymentProcessor = new PayPalPaymentProcessorAdapter(payPalPaymentService);
        final List<PaymentProcessor> paymentProcessors = List.of(stripePaymentProcessor, payPalPaymentProcessor);

        final double amount = 100;
        final String currency = "EUR";

        for (final PaymentProcessor processor : paymentProcessors) {
            processor.processPayment(amount, currency);
        }
    }
}