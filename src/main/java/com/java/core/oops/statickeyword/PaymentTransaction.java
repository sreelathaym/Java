package com.java.core.oops.statickeyword;

public class PaymentTransaction {
    private static int transactionCounter = 10000;

    private int transactionId;
    private String payerName;
    private double amount;
    private String paymentMode;

    public PaymentTransaction( String payerName, double amount, String paymentMode) {
        this.transactionId = ++transactionCounter;
        this.payerName = payerName;
        this.amount = amount;
        this.paymentMode = paymentMode;

    }

    // Method to display transaction details
    public void displayTransaction() {
        System.out.println("Transaction ID:" + transactionId + " Payer:" + payerName + "  Amount:" + amount + " Mode:" + paymentMode);
    }

}
class PaymentTransactionTest{
    public static void main(String[] args) {
        PaymentTransaction paymentTransaction1 = new PaymentTransaction("Alice",500,"Credit Card");
        paymentTransaction1.displayTransaction();

        PaymentTransaction paymentTransaction2 = new PaymentTransaction("Boby",400,"PayPal");
        paymentTransaction2.displayTransaction();

        PaymentTransaction paymentTransaction3= new PaymentTransaction("Charan",700,"Net Banking");
        paymentTransaction3.displayTransaction();
    }
}



/*
Scenario:
In a real-world payment processing system, every transaction must have a unique transaction ID to ensure traceability. We need a static counter to generate these IDs.

Requirements:
Create a class PaymentTransaction with:
A static variable transactionCounter initialized to 10000.
An instance variable transactionId, assigned using the static counter.
Instance variables for payerName, amount, and paymentMode.
A method displayTransaction() to print transaction details.

The transaction counter should increment automatically for every new transaction.
In main(), create three transactions and display their details.

Expected Output:

CopyEdit
Transaction ID: 10001, Payer: Alice, Amount: $500.00, Mode: Credit Card
Transaction ID: 10002, Payer: Bob, Amount: $200.00, Mode: PayPal
Transaction ID: 10003, Payer: Charlie, Amount: $750.50, Mode: Net Banking
 */