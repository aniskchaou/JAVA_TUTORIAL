
package advanced;

//A generic class declaration looks like a non-generic class declaration, 
//except that the class name is followed by a type parameter section.
public class GenericCLassTutorial<T> {
    
//As with generic methods, the type parameter section of a generic class can 
//have one or more type parameters separated by commas.
    
 private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
     
       GenericCLassTutorial<Integer> integerBox = new GenericCLassTutorial<Integer>();
      GenericCLassTutorial<String> stringBox = new GenericCLassTutorial<String>();
    
      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));

      System.out.printf("Integer Value :%d\n\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());
   }  
   
   //output
   //Integer Value :10
   //String Value :Hello World
}
