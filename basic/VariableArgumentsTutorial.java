
package basic;


public class VariableArgumentsTutorial {
    //JDK 1.5 enables you to pass a variable number of arguments of the same type to a method.
    
    
   public static void main(String args[]) {
      // Call method with variable args  
	   printMax(34, 3, 3, 2, 56.5);
      printMax(new double[]{1, 2, 3});
   }

   public static void printMax( double... numbers) {
      if (numbers.length == 0) {
         System.out.println("No argument passed");
         return;
      }

      double result = numbers[0];

      for (int i = 1; i <  numbers.length; i++)
      if (numbers[i] >  result)
      result = numbers[i];
      System.out.println("The max value is " + result);
   }
   
//Output
//The max value is 56.5
//The max value is 3.0

}
