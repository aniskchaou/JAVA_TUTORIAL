package collection;


import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


public class ProprietesTutorial {
// Properties is a subclass of Hashtable. It is used to maintain lists of values in which the key is a String and the value is also a String.

//The Properties class is used by many other Java classes. For example, it is the type of object returned by System.
//getProperties( ) when obtaining environmental values.

//Properties define the following instance variable. This variable holds a default property list associated with a
    //Properties object. 
    
    
//String getProperty(String key) Returns the value associated with the key. A null object is returned if the key is neither in the list nor in the default property list.
	

//String getProperty(String key, String defaultProperty) Returns the value associated with the key; defaultProperty is returned if the key is neither in the list nor in the default property list.
	

//void list(PrintStream streamOut) Sends the property list to the output stream linked to streamOut.
	

//void list(PrintWriter streamOut) Sends the property list to the output stream linked to streamOut.
	

//void load(InputStream streamIn) throws IOException Inputs a property list from the input stream linked to streamIn.
	

//Enumeration propertyNames( ) Returns an enumeration of the keys. This includes those keys found in the default property list, too.
	

//Object setProperty(String key, String value) Associates value with the key. Returns the previous value associated with the key, or returns null if no such association exists.
	

//void store(OutputStream streamOut, String description) After writing the string specified by description, the property list is written to the output stream linked to streamOut.

 public static void main(String args[]) {
      Properties capitals = new Properties();
      Set states;
      String str;
      
      capitals.put("Illinois", "Springfield");
      capitals.put("Missouri", "Jefferson City");
      capitals.put("Washington", "Olympia");
      capitals.put("California", "Sacramento");
      capitals.put("Indiana", "Indianapolis");

      // Show all states and capitals in hashtable.
      states = capitals.keySet();   // get set-view of keys
      Iterator itr = states.iterator();
      
      while(itr.hasNext()) {
         str = (String) itr.next();
         System.out.println("The capital of " + str + " is " + 
            capitals.getProperty(str) + ".");
      }     
      System.out.println();

      // look for state not in list -- specify default
      str = capitals.getProperty("Florida", "Not Found");
      System.out.println("The capital of Florida is " + str + ".");
   }
}
