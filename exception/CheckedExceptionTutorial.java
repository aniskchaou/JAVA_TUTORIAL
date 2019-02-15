
package exception;

//Checked exceptions − A checked exception is an exception that is checked (notified) by the compiler at 

import java.io.File;
import java.io.FileReader;

//compilation-time, these are also called as compile time exceptions. 
//These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.

public class CheckedExceptionTutorial {

//For example, if you use FileReader class in your program to read data from a file, if the file 
//specified in its constructor doesn't exist, then a FileNotFoundException occurs, 
//and the compiler prompts the programmer to handle the exception.
    
    public static void main(String args[]) {		
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file); 
   }
    
    //FilenotFound_Demo.java:8: error: unreported exception FileNotFoundException; 
    //must be caught or declared to be thrown
    //FileReader fr = new FileReader(file);
    
}
