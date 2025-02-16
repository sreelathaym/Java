package com.java.core.oops;
//AbstractClass
abstract class Payment{
     public abstract void processPayment(double amount);
}
class CreditCardPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing  Credit card payment::"+amount);
    }
}
class  PayPAl extends Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment::"+amount);
    }
}
class UPI extends Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment::"+amount);
    }
}
public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment;
        payment=new CreditCardPayment();
        payment.processPayment(600.0);

        payment=new PayPAl();
        payment.processPayment(800.0);

        payment=new UPI();
        payment.processPayment(1200.0);

    }

}
