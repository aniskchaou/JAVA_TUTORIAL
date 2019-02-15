//Java provides a mechanism, called object serialization where an object can be represented as a sequence 
//of bytes that includes the object's data as well as information about the object's type and the types of 
//data stored in the object.

//After a serialized object has been written into a file, it can be read from the file and deserialized that is, 
//the type information and bytes that represent the object and its data can be used to recreate the object in memory.

//Most impressive is that the entire process is JVM independent, meaning an object can be serialized on 
//one platform and deserialized on an entirely different platform.


package serialisation;




public class SerialisationTutorial implements java.io.Serializable {
    
   // Notice that for a class to be serialized successfully, two conditions must be met −

  //  The class must implement the java.io.Serializable interface.

   // All of the fields in the class must be serializable. If a field is not serializable, it must be marked transient.

    
    
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   
   public void mailCheck() {
      System.out.println("Mailing a check to " + name + " " + address);
   }
}
