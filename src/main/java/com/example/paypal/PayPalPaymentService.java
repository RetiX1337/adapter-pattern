package com.example.paypal;

public class PayPalPaymentService {
    public void sendPayment(double amount, String currency) {
        System.out.printf("Processing payment via PayPal. Amount: %f, currency: %s%n", amount, currency);
    }

    public void checkStatus(String transactionId) {
        System.out.printf("Status of transaction %s: Done%n", transactionId);
    }
}
