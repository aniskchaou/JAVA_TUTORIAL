
package serialisation;

//The ObjectOutputStream class is used to serialize an Object. 

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//The following SerializeDemo program instantiates an Employee object and serializes it to a file.

//When the program is done executing, a file named employee.ser is created.
public class Employee implements java.io.Serializable {
    
 
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   
   public void mailCheck() {
      System.out.println("Mailing a check to " + name + " " + address);
   }
}
public class SerializingObject {
     public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("/tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
