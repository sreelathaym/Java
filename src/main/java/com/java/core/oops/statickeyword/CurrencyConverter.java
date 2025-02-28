package com.java.core.oops.statickeyword;
import java.util.Scanner;

 public class CurrencyConverter {
     private static double usd_TO_INR = 82.5;
     private static double eur_TO_INR = 90.0;

    public static double convertUSDToINR(double amountUSD){
        return usd_TO_INR * amountUSD;
    }
    public static double convertEURToINR(double amountEUR){
        return eur_TO_INR * amountEUR;
    }
}
class CurrencyConverterRunner{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount in  $");
        double usdAmount=scanner.nextDouble();

        System.out.println("Enter amount in  €");
        double euroAmount= scanner.nextDouble();

        double usdToINR=CurrencyConverter.convertUSDToINR(usdAmount);
        System.out.printf("$%.2f in INR: ₹%.2f%n",usdAmount,usdToINR);

//        System.out.println("Enter amount in  €");
//        double euroAmount= scanner.nextDouble();
        double euroToINR=CurrencyConverter.convertEURToINR(euroAmount);
        System.out.printf("€%.2f in INR: ₹%.2f%n",euroAmount,euroToINR);
    }
}


/*
 Real-Time Assignment: Centralized Currency Converter for a Banking App

Scenario:
In international banking, a centralized currency converter is needed to convert between currencies dynamically without creating multiple instances.

Requirements:
Create a class CurrencyConverter with:
Static variables USD_TO_INR = 82.5 and EUR_TO_INR = 90.0.
Static methods:
convertUSDToINR(double amountUSD)
convertEURToINR(double amountEUR)
In main(), perform the following conversions:
Convert 150 USD to INR.
Convert 100 EUR to INR.


Expected Output:

$150 in INR: ₹12375.00
€100 in INR: ₹9000.00
 */
