
package advanced;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTutorial {
 //Java provides the java.util.regex package for pattern matching with regular expressions. Java regular expressions are 
    //very similar to the Perl programming language and very easy to learn.

//A regular expression is a special sequence of characters that helps you match or find other strings or sets of strings, 
        //using a specialized syntax held in a pattern.
        //They can be used to search, edit, or manipulate text and data.
   
    
    
    public static void main( String args[] ) {
      // String to be scanned to find the pattern.
      String line = "This order was placed for QT3000! OK?";
      String pattern = "(.*)(\\d+)(.*)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
      }else {
         System.out.println("NO MATCH");
      }
   }
    
    
 //Output
//Found value: This order was placed for QT3000! OK?
//Found value: This order was placed for QT300
//Found value: 0

}