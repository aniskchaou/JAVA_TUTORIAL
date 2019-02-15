
package basic;


public class DataTypeTutorial {

    
    public static void main(String[] args) {
      
     //byte
     //Byte data type is an 8-bit signed 
    //Minimum value is -128 
    //Maximum value is 127 
    //Default value is 0  
     byte a = 100 ;byte b = -50;

      
     
     //short
    //Short data type is a 16-bit 
    //Minimum value is -32,768 (-2^15)
    //Maximum value is 32,767 (inclusive) (2^15 -1)
    //Default value is 0.   
    short s = 10000; short r = -20000;

    //int
    //Int data type is a 32-bit =
    //Minimum value is - 2,147,483,648 
    //Maximum value is 2,147,483,647
    //The default value is 0 
    int a1 = 100000; int b1 = -200000;

   
    //long
    //Long data type is a 64-bit 
    //Minimum value is -9,223,372,036,854,775,808(-2^63)
    //Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
    //Default value is 0L   
    long a2 = 100000L; long b2 = -200000L;

        
      
    
    
    
   // float
   //Float data type is a single-precision 32-bit IEEE 754 floating point
   // Float is mainly used to save memory in large arrays of floating point numbers
   // Default value is 0.0f
   // Float data type is never used for precise values such as currency
    float f1 = 234.5f;

    
   //double
   //double data type is a double-precision 64-bit 
   //This data type is generally used as the default data type for decimal values, generally the default choice
   //Double data type should never be used for precise values such as currency
   //Default value is 0.0d 
     double d1 = 123.4;

     
     
    //boolean
    //boolean data type represents one bit of information
    //There are only two possible values: true and false
    //This data type is used for simple flags that track true/false conditions
    //Default value is false
    boolean one = true;


    //char
    //char data type is a single 16-bit Unicode character
    //Minimum value is '\u0000' (or 0)
    //Maximum value is '\uffff' (or 65,535 inclusive)
    //Char data type is used to store any character
     char letterA = 'A';

        
    }
    
}
