
package poo;


class Outer_Demo {
    
    
    //Creating an inner class is quite simple. You just need to write a class within a class. Unlike a class, 
   //an inner class can be private and once you declare an inner class private, it cannot be accessed from
   //an object outside the class.

//Following is the program to create an inner class and access it. In the given example, 
// we make the inner class private and access the class through a method.
    
   
   int num;
   
   // inner class
   private class Inner_Demo {
      public void print() {
         System.out.println("This is an inner class");
      }
   }
   
   // Accessing he inner class from the method within
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      inner.print();
   }
}
   
public class OuterInnerTutorial {

   public static void main(String args[]) {
      // Instantiating the outer class 
      Outer_Demo outer = new Outer_Demo();
      
      // Accessing the display_Inner() method.
      outer.display_Inner();
   }
   

}
