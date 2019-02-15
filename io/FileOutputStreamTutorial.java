
package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class FileOutputStreamTutorial {
    public static void main(String[] args) throws FileNotFoundException {
       // FileOutputStream
     //  FileOutputStream is used to create a file and write data into it. The stream would create a file, 
      //if it doesn't already exist, before opening it for output.



//Following constructor takes a file name as a string to create an input stream object to write the file −

OutputStream f1 = new FileOutputStream("C:/java/hello") ;

//Following constructor takes a file object to create an output stream object to write the file. 
        //First, we create a file object using File() method 

File f = new File("C:/java/hello");
OutputStream f2 = new FileOutputStream(f);


 	

//public void close() throws IOException{}   This method closes the file output stream. 
//Releases any system resources associated with the file.
//Throws an IOException.
	

//protected void finalize()throws IOException {}   This method cleans up the connection to the file. 
//Ensures that the close method of this file output stream is called when there are no more references to this stream. 
//Throws an IOException.
	

//public void write(int w)throws IOException{}   This methods writes the specified byte to the output stream.
 	

//public void write(byte[] w)   Writes w.length bytes from the mentioned byte array to the OutputStream.




    }
}
