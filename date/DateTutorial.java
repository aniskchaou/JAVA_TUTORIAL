
package date;

import java.util.Date;


public class DateTutorial {
    
    public static void main(String[] args) {
       

      // Instantiate a Date object
      Date date = new Date();
      // display time and date using toString()
      System.out.println(date.toString());
      
      
//boolean after(Date date) Returns true if the invoking Date object contains a date that is later than the one specified by date, otherwise, it returns false.
	
//boolean before(Date date)  Returns true if the invoking Date object contains a date that is earlier than the one specified by date, otherwise, it returns false.
	
//Object clone( ) Duplicates the invoking Date object.
	

//int compareTo(Date date) Compares the value of the invoking object with that of date. Returns 0 if the values are equal. Returns a negative value if the invoking object is earlier than date. Returns a positive value if the invoking object is later than date.
 	

//int compareTo(Object obj) Operates identically to compareTo(Date) if obj is of class Date. Otherwise, it throws a ClassCastException.
	

//boolean equals(Object date) Returns true if the invoking Date object contains the same time and date as the one specified by date, otherwise, it returns false.
 	

//long getTime( ) Returns the number of milliseconds that have elapsed since January 1, 1970.
	

//int hashCode( ) Returns a hash code for the invoking object.
	

//void setTime(long time) Sets the time and date as specified by time, which represents an elapsed time in milliseconds from midnight, January 1, 1970.
 	

//String toString( ) Converts the invoking Date object into a string and returns the result.
      
      
      
    }
}
