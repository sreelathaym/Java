package com.java.core.oops;
//Encapsulation
class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        //Checking initial balance
        if (initialBalance < 0) {
            System.out.println(" Initial balance cannot be negative, Setting balance to 0 for account " + accountNumber);
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    //Adding  amount to Account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit details");
            System.out.println("----------------");
            System.out.print("Deposited  ----" + amount +"\n"+ "accountNo----- "
                               + accountNumber +"\n"+ "Updated Balance---- " + balance+"\n");
            System.out.println();
        }
    }

    //withdraw Amount from Account
     public void withdraw(double amount){
        if(amount>0)
           if(balance >=amount){
               balance -=amount;
               System.out.println("withdraw details");
               System.out.println("----------------------");
               System.out.print("withdraw amount-----"+amount +" \naccount--------"
                                  +this.getAccountNumber()+ "\nRemaining amount----"+balance+"\n");
               System.out.println();

           }
        else{
               System.out.println("Insufficient amount in this account "+this.getAccountNumber()
                                   +" withdraw amount "+amount +" available amount "+balance+"\n");
           }
        else {
            System.out.println("Invalid amount in this Account "+this.getAccountNumber());
        }
        }

}
public class BankAccountRunner {
    public static void main(String[] args) {
        System.out.println("Account holder-----------1");
        BankAccount bankAccount = new BankAccount("AC-111","Havi",5000);
        bankAccount.deposit(2000);
        bankAccount.withdraw(3000);
        System.out.println("Account Holder-----------2");
        //Insufficient funds
        BankAccount bankAccount1 = new BankAccount("AC-222","Anvi",2000);
        bankAccount1.deposit(2000);
        bankAccount1.withdraw(8000);

        System.out.println("AccountHolder--------------3");
        BankAccount bankAccount2 = new BankAccount("AC-333","Baby",2000);
        bankAccount2.deposit(2000);
        bankAccount2.withdraw(3000);

    }
}
