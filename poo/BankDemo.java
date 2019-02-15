
package poo;

import exception.InsufficientFundsException;


public class BankDemo {

   public static void main(String [] args) {
      CheckingAccount c = new CheckingAccount(101);
      System.out.println("Depositing $500...");
      c.deposit(500.00);
      
      try {
         System.out.println("\nWithdrawing $100...");
         c.withdraw(100.00);
         System.out.println("\nWithdrawing $600...");
         c.withdraw(600.00);
      } catch (InsufficientFundsException e) {
         System.out.println("Sorry, but you are short $" + e.getAmount());
         e.printStackTrace();
      }
   }
   
//output   
//Depositing $500...
//Withdrawing $100...
//Withdrawing $600...
//Sorry, but you are short $200.0
//InsufficientFundsException
         //at CheckingAccount.withdraw(CheckingAccount.java:25)
        // at BankDemo.main(BankDemo.java:13)
}
