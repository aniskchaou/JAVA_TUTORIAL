
package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTutorial {
    //Java byte streams are used to perform input and output of 8-bit bytes. 
    //Though there are many classes related to byte streams but the most frequently used classes are,
    //FileInputStream and FileOutputStream.
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
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
}
