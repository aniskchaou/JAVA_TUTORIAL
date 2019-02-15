
package basic;


public class NumberTutorial {
  //All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number.
//The object of the wrapper class contains or wraps its respective primitive data type. 
//Converting primitive data types into object is called boxing, and this is taken care by the compiler. 
//Therefore, while using a wrapper class you just need to pass the value of the primitive data type to the constructor
//of the Wrapper class.
//And the Wrapper object will be converted back to a primitive data type, and this process is called unboxing. 
    
    public static void main(String[] args) {
      Integer x = 5; // boxes int to an Integer object
      x =  x + 10;   // unboxes the Integer to a int
      //When x is assigned an integer value, the compiler boxes the integer because x is integer object. 
      //Later, x is unboxed so that they can be added as an integer.
      System.out.println(x); 
    }
    
    
    
    

//xxxValue() Converts the value of this Number object to the xxx data type and returns it.
	

//compareTo() Compares this Number object to the argument.
	

//equals() Determines whether this number object is equal to the argument.
	

//valueOf() Returns an Integer object holding the value of the specified primitive.
	

//toString() Returns a String object representing the value of a specified int or Integer.
	

//parseInt() This method is used to get the primitive data type of a certain String.
	

//abs() Returns the absolute value of the argument.
	

//ceil() Returns the smallest integer that is greater than or equal to the argument. Returned as a double.
	

//floor() Returns the largest integer that is less than or equal to the argument. Returned as a double.
	

//rint() Returns the integer that is closest in value to the argument. Returned as a double.
	

//round() Returns the closest long or int, as indicated by the method's return type to the argument.
	

//min() Returns the smaller of the two arguments.
	

//max() Returns the larger of the two arguments.
	

//exp() Returns the base of the natural logarithms, e, to the power of the argument.
	

//log() Returns the natural logarithm of the argument.
	

//pow() Returns the value of the first argument raised to the power of the second argument.
	

//sqrt() Returns the square root of the argument.
	

//sin() Returns the sine of the specified double value.
	

//cos() Returns the cosine of the specified double value.
 	

//tan() Returns the tangent of the specified double value.
	

//asin() Returns the arcsine of the specified double value.
	

//acos() Returns the arccosine of the specified double value.
 	

//atan() Returns the arctangent of the specified double value.
	

//atan2() Converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.
 	

//toDegrees() Converts the argument to degrees.
	

//toRadians() Converts the argument to radians.
	

//random() Returns a random number.
    
}
