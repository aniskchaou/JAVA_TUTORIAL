
package io;

import java.io.File;


public class ListingDirectoriesTutorial {
    public static void main(String[] args) {
        //You can use list( ) method provided by File object to list down all the files and directories available in a directory
        
         File file = null;
      String[] paths;
  
      try {      
         // create new file object
         file = new File("/tmp");

         // array of files and directory
         paths = file.list();

         // for each name in the path array
         for(String path:paths) {
            // prints filename and directory name
            System.out.println(path);
         }
      } catch (Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
    }
}
