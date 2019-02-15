
package io;


public class StackTutorial {

    //Stack is a subclass of Vector that implements a standard last-in, first-out stack.

//Stack only defines the default constructor, which creates an empty stack.
    //Stack includes all the methods defined by Vector, and adds several of its own.
        
//boolean empty()

//Tests if this stack is empty. Returns true if the stack is empty, and returns false if the stack contains elements.
 	

//Object peek( ) Returns the element on the top of the stack, but does not remove it.
 	

//Object pop( ) Returns the element on the top of the stack, removing it in the process.
 	

//Object push(Object element) Pushes the element onto the stack. Element is also returned.
	

//int search(Object element) Searches for element in the stack. If found, its offset from the top of the stack is returned. Otherwise, -1 is returned.

 static void showpush(Stack st, int a) {
      st.push(new Integer(a));
      System.out.println("push(" + a + ")");
      System.out.println("stack: " + st);
   }

   static void showpop(Stack st) {
      System.out.print("pop -> ");
      Integer a = (Integer) st.pop();
      System.out.println(a);
      System.out.println("stack: " + st);
   }

   public static void main(String args[]) {
      Stack st = new Stack();
      System.out.println("stack: " + st);
      showpush(st, 42);
      showpush(st, 66);
      showpush(st, 99);
      showpop(st);
      showpop(st);
      showpop(st);
      try {
         showpop(st);
      } catch (EmptyStackException e) {
         System.out.println("empty stack");
      }
   }
}
