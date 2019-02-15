
package basic;


public class CommandLineArgumentsTutorial {
    //Sometimes you will want to pass some information into a program when you run it. 
//This is accomplished by passing command-line arguments to main( ).
    
    
   public static void main(String args[]) { 
      for(int i = 0; i<args.length; i++) {
         System.out.println("args[" + i + "]: " +  args[i]);
      }
   } 
   
   
//Output
//args[0]: this
//args[1]: is
//args[2]: a
//args[3]: command
//args[4]: line
//args[5]: 200
//args[6]: -100
}







