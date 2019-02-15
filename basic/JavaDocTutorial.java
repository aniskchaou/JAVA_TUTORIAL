package basic;

//Javadoc is a tool which comes with JDK and it is used for generating Java code documentation in HTML format

import java.io.IOException;

//from Java source code, which requires documentation in a predefined format.





//The javadoc Tags

//@author 	Adds the author of a class. 	

//{@code} 	Displays text in code font without interpreting the text as HTML markup or nested javadoc tags. 

//{@docRoot} Represents the relative path to the generated document's root directory from any generated page. 	

//@deprecated Adds a comment indicating that this API should no longer be used. 	

//@exception Adds a Throws subheading to the generated documentation, with the classname and description text. 	

//{@inheritDoc} Inherits a comment from the nearest inheritable class or implementable interface. 	Inherits a comment from the immediate surperclass.

//{@link} 	Inserts an in-line link with the visible text label that points to the documentation for the specified package, class, or member name of a referenced class. 	

//{@linkplain} Identical to {@link}, except the link's label is displayed in plain text than code font. 	

//@param 	Adds a parameter with the specified parameter-name followed by the specified description to the "Parameters" section. 	

//@return 	Adds a "Returns" section with the description text. 	

//@see 	Adds a "See Also" heading with a link or text entry that points to reference. 	

//@serial 	Used in the doc comment for a default serializable field. 	

//@serialData Documents the data written by the writeObject( ) or writeExternal( ) methods. 	

//@serialField Documents an ObjectStreamField component. 	

//@since 	Adds a "Since" heading with the specified since-text to the generated documentation. 	

//@throws 	The @throws and @exception tags are synonyms. 	

//{@value} 	When {@value} is used in the doc comment of a static field, it displays the value of that constant. 

//@version 	Adds a "Version" subheading with the specified version-text to the generated docs when the -version option is used. 	
public class JavaDocTutorial {
    
    /**
   * This method is used to add two integers. This is
   * a the simplest form of a class method, just to
   * show the usage of various javadoc Tags.
   * @param numA This is the first paramter to addNum method
   * @param numB  This is the second parameter to addNum method
   * @return int This returns sum of numA and numB.
   */
   public int addNum(int numA, int numB) {
      return numA + numB;
   }

   /**
   * This is the main method which makes use of addNum method.
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */

   public static void main(String args[]) throws IOException {
      JavaDocTutorial obj = new JavaDocTutorial();
      int sum = obj.addNum(10, 20);

      System.out.println("Sum of 10 and 20 is :" + sum);
   }
}
