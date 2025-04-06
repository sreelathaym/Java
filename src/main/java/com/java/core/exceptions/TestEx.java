package com.java.core.exceptions;
class AgeException extends Exception{
   AgeException(String message){
       super(message);
   }

}

class UserDefinedExceptionEx {
   public static void checkAge(int age) throws AgeException {
       if(age<18){
           throw new AgeException("you must be 18+ to register");
       }
       System.out.println("Registration Successful");
   }

    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (AgeException e) {
            System.out.println("Caught Exception"+e.getMessage());
        }
    }
}

