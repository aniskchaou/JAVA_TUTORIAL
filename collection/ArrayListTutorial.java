/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author user
 */
public class ArrayListTutorial {
    void add(int index, Object element)

Inserts the specified element at the specified position index in this list. Throws IndexOutOfBoundsException if the specified index is out of range (index < 0 || index > size()).
2 	

boolean add(Object o)

Appends the specified element to the end of this list.
3 	

boolean addAll(Collection c)

Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator. Throws NullPointerException, if the specified collection is null.
4 	

boolean addAll(int index, Collection c)

Inserts all of the elements in the specified collection into this list, starting at the specified position. Throws NullPointerException if the specified collection is null.
5 	

void clear()

Removes all of the elements from this list.
6 	

Object clone()

Returns a shallow copy of this ArrayList.
7 	

boolean contains(Object o)

Returns true if this list contains the specified element. More formally, returns true if and only if this list contains at least one element e such that (o==null ? e==null : o.equals(e)).
8 	

void ensureCapacity(int minCapacity)

Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
9 	

Object get(int index)

Returns the element at the specified position in this list. Throws IndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= size()).
10 	

int indexOf(Object o)

Returns the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
11 	

int lastIndexOf(Object o)

Returns the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
12 	

Object remove(int index)

Removes the element at the specified position in this list. Throws IndexOutOfBoundsException if the index out is of range (index < 0 || index >= size()).
13 	

protected void removeRange(int fromIndex, int toIndex)

Removes from this List all of the elements whose index is between fromIndex, inclusive and toIndex, exclusive.
14 	

Object set(int index, Object element)

Replaces the element at the specified position in this list with the specified element. Throws IndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= size()).
15 	

int size()

Returns the number of elements in this list.
16 	

Object[] toArray()

Returns an array containing all of the elements in this list in the correct order. Throws NullPointerException if the specified array is null.
17 	

Object[] toArray(Object[] a)

Returns an array containing all of the elements in this list in the correct order; the runtime type of the returned array is that of the specified array.
18 	

void trimToSize()

Trims the capacity of this ArrayList instance to be the list's current size.

public static void main(String args[]) {
      // create an array list
      ArrayList al = new ArrayList();
      System.out.println("Initial size of al: " + al.size());

      // add elements to the array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      al.add(1, "A2");
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al);

      // Remove elements from the array list
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
   }

}
