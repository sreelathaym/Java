package com.java.core.oops.statickeyword;

public class CardProcessor {
    //Static nested class
    static class CardValidator{
        public static boolean isValidCard(String cardNumber){
            if(cardNumber.startsWith("4")){
                System.out.println("Card "+cardNumber+" Visa");
                return true;
            }else if(cardNumber.startsWith("5")){
                System.out.println("Card "+cardNumber+" Mastercard");
                return true;
            }else{
                System.out.println("Card "+cardNumber+" invalid");
                return false;
            }
        }
    }
}
class CardProcessorTest {
    public static void main(String[] args) {
        CardProcessor.CardValidator.isValidCard("5123456789012345");
        CardProcessor.CardValidator.isValidCard("378282246310005");
        CardProcessor.CardValidator.isValidCard("4123456789012345");
    }
}

/*
Scenario:

A banking application should verify if a credit card number is valid based on its starting digits.

Scenario:
A banking application should verify if a credit card number is valid based on its starting digits.

Requirements:

Create a class CardProcessor with:
A static nested class CardValidator.
A static method isValidCard(String cardNumber):
Return true if the card starts with "4" (Visa) or "5" (Mastercard), else false.
In main(), validate two cards:
"5123456789012345" → Mastercard
"378282246310005" → Invalid
 */
