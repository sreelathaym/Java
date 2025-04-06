package exception.realtimeexamples;

 class TooManyFailedAttemptsException extends Exception {
    public TooManyFailedAttemptsException(String message){
        super(message);
    }
}

public class UserAuthentication{
     private static int failedAttempt =0;
     private static void login(final String password) throws TooManyFailedAttemptsException{
         String correctPassword ="CorrectPassword@123";

         if(!correctPassword.equals(password)) {
             failedAttempt++;
             if (failedAttempt >= 3) {
                 throw new TooManyFailedAttemptsException("Account is locked due to multiple Attempts,please try after 24 hours");
             }
             System.out.println("Incorrect Password attempt::" + password);
         }else{
                 System.out.println("Login successful");
             }
         }

    public static void main(String[] args) {
        System.out.println("pls enter the password");

        try{
            login("wrongpassword");
            login("wrongpassword");
            login("wrongpassword");
        }catch(TooManyFailedAttemptsException e){
            System.out.println(("Error:"+e.getMessage()));
            throw new RuntimeException(e);
        }
    }

     }


