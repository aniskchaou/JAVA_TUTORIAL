
package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class FileInputStreamReaderTutorial {

    public static void main(String[] args) throws FileNotFoundException {
  // constructor takes a file name as a string to create an input stream object to read the file −
InputStream f = new FileInputStream("C:/java/hello");

//Following constructor takes a file object to create an input stream object to read the file. 
//First we create a file object using File() method 

File file = new File("C:/java/hello");
InputStream fis = new FileInputStream(file);


	

//public void close() throws IOException{} This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.
 	

//protected void finalize()throws IOException {} This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.
 	

//public int read(int r)throws IOException{} This method reads the specified byte of data from the InputStream. Returns an int. Returns the next byte of data and -1 will be returned if it's the end of the file.
 	

//public int read(byte[] r) throws IOException{} This method reads r.length bytes from the input stream into an array. Returns the total number of bytes read. If it is the end of the file, -1 will be returned.
 	

//public int available() throws IOException{} Gives the number of bytes that can be read from this file input stream. Returns an int.
    
    
    }

}
