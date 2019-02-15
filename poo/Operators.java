
package poo;


public class Operators {
    
// The Arithmetic Operators
    int a=20;
    int b=10;
    
// + (Addition) 	
   int c= a+b ;
//- (Subtraction) 	Subtracts right-hand operand from left-hand operand. 	
   int c=a-b;
//* (Multiplication) 	Multiplies values on either side of the operator. 	
int c$a*b;
//  / (Division) 	Divides left-hand operand by right-hand operand. 	
int c=a/b;
//% (Modulus) 	Divides left-hand operand by right-hand operand and returns remainder. 	
int c = a%b;
//++ (Increment) 	Increases the value of operand by 1.
a++;
//-- (Decrement) 	Decreases the value of operand by 1. 	
b++;
    
    
    
    
    
//The Relational Operators



Assume variable A holds 10 and variable B holds 20, then −




//== (equal to) 	Checks if the values of two operands are equal or not, if yes then condition becomes true. 	(A == B) is not true.

//!= (not equal to) 	Checks if the values of two operands are equal or not, if values are not equal then condition becomes true. 	(A != B) is true.

//> (greater than) 	Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true. 	(A > B) is not true.

//< (less than) 	Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true. 	(A < B) is true.

//>= (greater than or equal to) 	Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true. 	(A >= B) is not true.

//<= (less than or equal to) 	Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true. 	(A <= B) is true.



The Bitwise Operators

Java defines several bitwise operators, which can be applied to the integer types, long, int, short, char, and byte.

Bitwise operator works on bits and performs bit-by-bit operation. Assume if a = 60 and b = 13; now in binary format they will be as follows −

a = 0011 1100

b = 0000 1101

-----------------

a&b = 0000 1100

a|b = 0011 1101

a^b = 0011 0001

~a  = 1100 0011

The following table lists the bitwise operators −

Assume integer variable A holds 60 and variable B holds 13 then −

Show Examples
Operator 	Description 	Example
& (bitwise and) 	Binary AND Operator copies a bit to the result if it exists in both operands. 	(A & B) will give 12 which is 0000 1100
| (bitwise or) 	Binary OR Operator copies a bit if it exists in either operand. 	(A | B) will give 61 which is 0011 1101
^ (bitwise XOR) 	Binary XOR Operator copies the bit if it is set in one operand but not both. 	(A ^ B) will give 49 which is 0011 0001
~ (bitwise compliment) 	Binary Ones Complement Operator is unary and has the effect of 'flipping' bits. 	(~A ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number.
<< (left shift) 	Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand. 	A << 2 will give 240 which is 1111 0000
>> (right shift) 	Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand. 	A >> 2 will give 15 which is 1111
>>> (zero fill right shift) 	Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros. 	A >>>2 will give 15 


//The Logical Operators

boolean a=true;
boolean b=false;

//&& (logical and) 	Called Logical AND operator.	
 a&&b  //false

//|| (logical or) 	Called Logical OR Operator. 
a||b  //true

//! (logical not) 	Called Logical NOT Operator. 
!a //false




The Assignment Operators

Following are the assignment operators supported by Java language −

Show Examples
Operator 	Description 	Example
= 	Simple assignment operator. Assigns values from right side operands to left side operand. 	C = A + B will assign value of A + B into C
+= 	Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand. 	C += A is equivalent to C = C + A
-= 	Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand. 	C -= A is equivalent to C = C – A
*= 	Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand. 	C *= A is equivalent to C = C * A
/= 	Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand. 	C /= A is equivalent to C = C / A
%= 	Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand. 	C %= A is equivalent to C = C % A
<<= 	Left shift AND assignment operator. 	C <<= 2 is same as C = C << 2
>>= 	Right shift AND assignment operator. 	C >>= 2 is same as C = C >> 2
&= 	Bitwise AND assignment operator. 	C &= 2 is same as C = C & 2
^= 	bitwise exclusive OR and assignment operator. 	C ^= 2 is same as C = C ^ 2
|= 	bitwise inclusive OR and assignment operator. 	C |= 2 is same as C = C | 2




Conditional Operator ( ? : )

Conditional operator is also known as the ternary operator. This operator consists of three operands and is used to evaluate Boolean expressions. The goal of the operator is to decide, which value should be assigned to the variable. The operator is written as −

variable x = (expression) ? value if true : value if false

Following is an example −

Example
Live Demo

public class Test {

   public static void main(String args[]) {
      int a, b;
      a = 10;
      b = (a == 1) ? 20: 30;
      System.out.println( "Value of b is : " +  b );

      b = (a == 10) ? 20: 30;
      System.out.println( "Value of b is : " + b );
   }
}



instanceof Operator

This operator is used only for object reference variables. The operator checks whether the object is of a particular type (class type or interface type). instanceof operator is written as −

( Object reference variable ) instanceof  (class/interface type)

If the object referred by the variable on the left side of the operator passes the IS-A check for the class/interface type on the right side, then the result will be true. Following is an example −

Example
Live Demo

public class Test {

   public static void main(String args[]) {

      String name = "James";

      // following will return true since name is type of String
      boolean result = name instanceof String;
      System.out.println( result );
   }
}

This will produce the following result −

Output

true


}
