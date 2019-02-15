
package basic;


public class ArrayTutorial {
  
    
    public static void main(String[] args) {
        //Declaring Array Variables
        double[] myList;   // preferred way.
        double myList2[];   // works but not preferred way.
        
        //Creating Arrays
        //create an array by using the new operator with the following
        //The array elements are accessed through the index. 
        //Array indices are 0-based; that is, they start from 0 to arrayRefVar.length-1.
        
        //creates an array of 10 elements of double type and assigns its reference to myList
        double[] myList3 = new double[10];
       
        

      //Processing Arrays
        double[] myList4 = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      for (int i = 0; i < myList4.length; i++) {
         System.out.println(myList4[i] + " ");
      }
     
      // Summing all elements
      double total = 0;
      for (int i = 0; i < myList4.length; i++) {
         total += myList4[i];
      }
      System.out.println("Total is " + total);
      
      // Finding the largest element
      double max = myList4[0];
      for (int i = 1; i < myList4.length; i++) {
         if (myList4[i] > max) max = myList4[i];
      }
      System.out.println("Max is " + max); 
      
      
      
      //The foreach Loops
      
       double[] myList5 = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      for (double element: myList5) {
         System.out.println(element);
      }
      
      
      
      
 // Passing Arrays to Methods
//Just as you can pass primitive type values to methods, you can also pass arrays to methods. 
printArray(new int[]{3, 1, 2, 6, 4, 2});    



      
    }
    
    public static void printArray(int[] array) {
   for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
   }
}
    
    
    public static int[] reverse(int[] list) {
   int[] result = new int[list.length];

   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
      result[j] = list[i];
   }
   return result;
}
    
    
     	

//public static int binarySearch(Object[] a, Object key)
 	
//public static boolean equals(long[] a, long[] a2)

//public static void fill(int[] a, int val)

//public static void sort(Object[] a)


}
