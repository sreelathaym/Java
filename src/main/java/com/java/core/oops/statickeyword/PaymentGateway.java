package com.java.core.oops.statickeyword;

public class PaymentGateway {
    static{
        System.out.println("Initializing Payment Gateway... Loading API Keys...");
    }
    public static void processPayment(String payer, double amount){
        //System.out.printf("Processing payment of $%.2f for %s%n", amount, payer);
        System.out.println("Processing payment of "+amount +" for "+payer);

    }
}
class PaymentTest{
    public static void main(String[] args) {
        PaymentGateway.processPayment("Alice",500);
        PaymentGateway.processPayment("Krish",450);
    }
}


/*
Scenario:
Every online payment system requires a payment gateway (Stripe, PayPal, Razorpay) to be initialized before processing transactions.

Requirements:

Create a class PaymentGateway with:
A static block that prints "Initializing Payment Gateway... Loading API Keys...".
A static method processPayment(String payer, double amount) that prints "Processing payment of $amount for payer".

In main(), process two payments.

Expected Output:

Initializing Payment Gateway... Loading API Keys...
Processing payment of $250.00 for Alice
Processing payment of $120.50 for Bob
 */
