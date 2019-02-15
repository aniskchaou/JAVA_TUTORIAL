
package exception;


public class UncheckedExceptionTutorial {
    

//Unchecked exceptions − An unchecked exception is an exception that occurs at the time of execution. 
 //These are also called as Runtime Exceptions. These include programming bugs, such as logic errors
 //or improper use of an API. Runtime exceptions are ignored at the time of compilation.

//For example, if you have declared an array of size 5 in your program, and trying to call the 6th element of the array then
//an ArrayIndexOutOfBoundsExceptionexception occurs.
    
    public static void main(String[] args) {
         int num[] = {1, 2, 3, 4};
      System.out.println(num[5]);
    }
    
    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
    //at Exceptions.Unchecked_Demo.main(Unchecked_Demo.java:8)
    //Errors − These are not exceptions at all, but problems that arise beyond the control of the user or the programmer. 
    //Errors are typically ignored in your code because you can rarely do anything about an error. 
    
}
