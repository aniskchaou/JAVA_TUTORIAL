
package exception;

import java.io.FileInputStream;
import java.io.IOException;


public class MultipleCatchExceptionTutorial {
   // The previous statements demonstrate three catch blocks, but you can have any number of them after a single try.
    //If an exception occurs in the protected code, the exception is thrown to the first catch block in the list.
    //If the data type of the exception thrown matches ExceptionType1, 
     //it gets caught there. 
    
    //If not, the exception passes down to the second catch statement.
   
    public static void main(String[] args) {
        
       try {
   file = new FileInputStream(fileName);
   x = (byte) file.read();
} catch (IOException i) {
   i.printStackTrace();
   return -1;
} catch (FileNotFoundException f) // Not valid! {
   f.printStackTrace();
   return -1;
 
    }

    //catch (IOException|FileNotFoundException ex) {
  // logger.log(ex);
  // throw ex;
}
