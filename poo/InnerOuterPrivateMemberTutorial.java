
package poo;



 class Outer_Demo2 {
   // private variable of the outer class
   private int num = 175;  
   
   // inner class
   public class Inner_Demo {
      public int getNum() {
         System.out.println("This is the getnum method of the inner class");
         return num;
      }
   }
}


public class InnerOuterPrivateMemberTutorial {
    //inner classes are also used to access the private members of a class. 
    //Suppose, a class is having private members to access them.


   public static void main(String args[]) {
      // Instantiating the outer class
      Outer_Demo2 outer = new Outer_Demo2();
      
      // Instantiating the inner class
      Outer_Demo2.Inner_Demo inner = outer.new Inner_Demo();
      System.out.println(inner.getNum());
   }
}
    
    

