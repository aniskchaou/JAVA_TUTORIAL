
package exception;

import java.rmi.RemoteException;


public class ThrowsThrowExceptionTutorial {
    //If a method does not handle a checked exception, the method must declare it using the throws keyword. 
    //The throws keyword appears at the end of a method's signature.
    
    public void deposit(double amount) throws RemoteException {
      // Method implementation
      //You can throw an exception, either a newly instantiated one or an exception that you just caught, 
      //by using the throw keyword.


      throw new RemoteException();
   }
//the difference between throws and throw keywords, throws is used to postpone the handling 
//of a checked exception and throw is used to invoke an exception explicitly.
}
