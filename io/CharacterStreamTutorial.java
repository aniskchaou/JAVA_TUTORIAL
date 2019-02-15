
package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharacterStreamTutorial {
    //Java Byte streams are used to perform input and output of 8-bit bytes, 
    //whereas Java Character streams are used to perform input and output for 16-bit unicode. 
    //Though there are many classes related to character streams but the most frequently used classes are, 
    //FileReader and FileWriter.
     public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
     
     
     
     //FileInputStream
     
}
