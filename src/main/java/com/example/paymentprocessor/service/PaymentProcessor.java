package com.example.paymentprocessor.service;

public interface PaymentProcessor {
    void processPayment(double amount, String currency);
}
