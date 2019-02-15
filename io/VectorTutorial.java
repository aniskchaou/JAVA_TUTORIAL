
package io;


public class VectorTutorial {
 //   Vector implements a dynamic array. It is similar to ArrayList, but with two differences −

//    Vector is synchronized.

  //  Vector contains many legacy methods that are not part of the collections framework.

//Vector proves to be very useful if you don't know the size of the array in advance or you just need one that can change sizes over the lifetime of a program.

        
        
//void add(int index, Object element)Inserts the specified element at the specified position in this Vector.
	

//boolean add(Object o)Appends the specified element to the end of this Vector.
	

//boolean addAll(Collection c) Appends all of the elements in the specified Collection to the end of this Vector, in the order that they are returned by the specified Collection's Iterator.
	

//boolean addAll(int index, Collection c)Inserts all of the elements in in the specified Collection into this Vector at the specified position.
	

//void addElement(Object obj)Adds the specified component to the end of this vector, increasing its size by one.
	

//int capacity() Returns the current capacity of this vector.
	

//void clear()Removes all of the elements from this vector.
	

//Object clone()Returns a clone of this vector.
	

//boolean contains(Object elem)Tests if the specified object is a component in this vector.
	

//boolean containsAll(Collection c)Returns true if this vector contains all of the elements in the specified Collection.
	

//void copyInto(Object[] anArray)Copies the components of this vector into the specified array.
	

//Object elementAt(int index)Returns the component at the specified index.
	

//Enumeration elements()Returns an enumeration of the components of this vector.
	

//void ensureCapacity(int minCapacity)Increases the capacity of this vector, if necessary, to ensure that it can hold at least the number of components specified by the minimum capacity argument.
	

//boolean equals(Object o)Compares the specified Object with this vector for equality.
	

//Object firstElement()Returns the first component (the item at index 0) of this vector.
	

//Object get(int index)Returns the element at the specified position in this vector.
	

//int hashCode()Returns the hash code value for this vector.
	

//int indexOf(Object elem)Searches for the first occurence of the given argument, testing for equality using the equals method.
	

//int indexOf(Object elem, int index)Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method.
	

//void insertElementAt(Object obj, int index)Inserts the specified object as a component in this vector at the specified index.
	

//boolean isEmpty()Tests if this vector has no components.
	

//Object lastElement()Returns the last component of the vector.
	

//int lastIndexOf(Object elem)Returns the index of the last occurrence of the specified object in this vector.
	

//int lastIndexOf(Object elem, int index)Searches backwards for the specified object, starting from the specified index, and returns an index to it.
	

//Object remove(int index) Removes the element at the specified position in this vector.
	

//boolean remove(Object o) Removes the first occurrence of the specified element in this vector, If the vector does not contain the element, it is unchanged.
	

//boolean removeAll(Collection c) Removes from this vector all of its elements that are contained in the specified Collection.
	

//void removeAllElements() Removes all components from this vector and sets its size to zero.
	

//boolean removeElement(Object obj) Removes the first (lowest-indexed) occurrence of the argument from this vector.
	

//void removeElementAt(int index) removeElementAt(int index).
	

//protected void removeRange(int fromIndex, int toIndex) Removes from this List all of the elements whose index is between fromIndex, inclusive and toIndex, exclusive.
	

//boolean retainAll(Collection c) Retains only the elements in this vector that are contained in the specified Collection.
	

//Object set(int index, Object element) Replaces the element at the specified position in this vector with the specified element.
	

//void setElementAt(Object obj, int index) Sets the component at the specified index of this vector to be the specified object.
	

//void setSize(int newSize) Sets the size of this vector.
	

//int size() Returns the number of components in this vector.
	

//List subList(int fromIndex, int toIndex) Returns a view of the portion of this List between fromIndex, inclusive, and toIndex, exclusive.
	

//Object[] toArray() Returns an array containing all of the elements in this vector in the correct order.
	

//Object[] toArray(Object[] a) Returns an array containing all of the elements in this vector in the correct order; the runtime type of the returned array is that of the specified array.
	

//String toString() Returns a string representation of this vector, containing the String representation of each element.
	

//void trimToSize() Trims the capacity of this vector to be the vector's current size.


public static void main(String args[]) {
      // initial size is 3, increment is 2
      Vector v = new Vector(3, 2);
      System.out.println("Initial size: " + v.size());
      System.out.println("Initial capacity: " + v.capacity());
      
      v.addElement(new Integer(1));
      v.addElement(new Integer(2));
      v.addElement(new Integer(3));
      v.addElement(new Integer(4));
      System.out.println("Capacity after four additions: " + v.capacity());

      v.addElement(new Double(5.45));
      System.out.println("Current capacity: " + v.capacity());
      
      v.addElement(new Double(6.08));
      v.addElement(new Integer(7));
      System.out.println("Current capacity: " + v.capacity());
      
      v.addElement(new Float(9.4));
      v.addElement(new Integer(10));
      System.out.println("Current capacity: " + v.capacity());
      
      v.addElement(new Integer(11));
      v.addElement(new Integer(12));
      System.out.println("First element: " + (Integer)v.firstElement());
      System.out.println("Last element: " + (Integer)v.lastElement());
      
      if(v.contains(new Integer(3)))
         System.out.println("Vector contains 3.");
         
      // enumerate the elements in the vector.
      Enumeration vEnum = v.elements();
      System.out.println("\nElements in vector:");
      
      while(vEnum.hasMoreElements())
         System.out.print(vEnum.nextElement() + " ");
      System.out.println();
   }
        
        }
