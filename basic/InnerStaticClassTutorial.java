
package basic;





public class InnerStaticClassTutorial {
    
    //A static inner class is a nested class which is a static member of the outer class. It can be accessed without instantiating the
//outer class, using other static members. Just like static members, a static nested class 
//does not have access to the instance variables and methods of the outer class. The syntax of static nested class
    
    
    
   static class Nested_Demo {
      public void my_method() {
         System.out.println("This is my nested class");
      }
   }
   
   public static void main(String args[]) {
      InnerStaticClassTutorial.Nested_Demo nested = new InnerStaticClassTutorial.Nested_Demo();	 
      nested.my_method();
   }
}