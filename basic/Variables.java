
package basic;


public class Variables {
   
    
  



   public void pupAge() {
       
       
      // Local Variables
    //declared in methods, constructors, or blocks.
    //will be destroyed once it exits the method, constructor, or block.
    //Access modifiers cannot be used for local variables.
    //Local variables are visible only within the declared method, constructor, or block.
    //Local variables are implemented at stack level internally.
    //There is no default value for local variables, so local variables should be declared and an initial value should be assigned before the first use.

       int age = 0;
       //This will produce the following error while compiling it
       int age2;
      age = age + 7;
      System.out.println("Puppy age is : " + age);
   }
   
   
   

    //Class variable
    //Static variables are created when the program starts and destroyed when the program stops.
    //Default values are same as instance variables. For numbers, the default value is 0; for Booleans, it is false; and for object references, it is null. Values can be assigned during the declaration or within the constructor. Additionally, values can be assigned in special static initializer blocks.
    //Static variables can be accessed by calling with the class name ClassName.VariableName.
   // When declaring class variables as public static final, then variable names (constants) are all in upper case. If the static variables are not public and final, the naming syntax is the same as instance and local variables.
    
    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";


   public static void main(String args[]) {
        
       System.err.println(Variables.DEPARTMENT);
   
      Variables test = new Variables();
      test.pupAge();
   }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

