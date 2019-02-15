
package io;

import java.io.File;


public class DirectoriesTutorial {
    public static void main(String[] args) {

     //A directory is a File which can contain a list of other files and directories. 
     //You use File object to create directories, to list down files available in a directory. 
     //For complete detail, check a list of all the methods which you can call on File object 
     //and what are related to directories.
                
        String dirname = "/tmp/user/java/bin";
      File d = new File(dirname);
      
      // Create directory now.
      d.mkdirs();        
                
       
      
      

    //The mkdir( ) method creates a directory, returning true on success and false on failure. 
    //Failure indicates that the path specified in the File object already exists, 
    //or that the directory cannot be created because the entire path does not exist yet.

   // The mkdirs() method creates both a directory and all the parents of the directory.

    }
}
