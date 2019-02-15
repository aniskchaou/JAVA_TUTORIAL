
package exception;


public class InsufficientFundsException extends Exception {
 //You can create your own exceptions in Java. Keep the following points in mind when writing your own exception classes 

//-All exceptions must be a child of Throwable.
//-If you want to write a checked exception that is automatically enforced by the Handle or Declare Rule, 
//you need to extend the Exception class.
//-If you want to write a runtime exception, you need to extend the RuntimeException class.
   
    private double amount;
   
   public InsufficientFundsException(double amount) {
      this.amount = amount;
   }
   
   public double getAmount() {
      return amount;
   }
    
    
    
    
}

