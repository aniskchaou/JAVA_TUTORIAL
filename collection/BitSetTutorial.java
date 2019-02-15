
package collection;

//The BitSet class creates a special type of array that holds bit values.
//The BitSet array can increase in size as needed. This makes it similar to a vector of bits. 
//This is a legacy class but it has been completely re-engineered in Java 2, version 1.4.
public class BitSetTutorial {

//void and(BitSet bitSet) ANDs the contents of the invoking BitSet object with those specified by bitSet. The result is placed into the invoking object.
	

//void andNot(BitSet bitSet) For each 1 bit in bitSet, the corresponding bit in the invoking BitSet is cleared.
	

//int cardinality( ) Returns the number of set bits in the invoking object.
	

//void clear( ) Zeros all bits.
	

//void clear(int index) Zeros the bit specified by index.
	

//void clear(int startIndex, int endIndex) Zeros the bits from startIndex to endIndex.
	

//Object clone( ) Duplicates the invoking BitSet object.
	

//boolean equals(Object bitSet) Returns true if the invoking bit set is equivalent to the one passed in bitSet. Otherwise, the method returns false.
	

//void flip(int index)Reverses the bit specified by the index.
	

//void flip(int startIndex, int endIndex) Reverses the bits from startIndex to endIndex.
	

//boolean get(int index)Returns the current state of the bit at the specified index.
	

//BitSet get(int startIndex, int endIndex)Returns a BitSet that consists of the bits from startIndex to endIndex. The invoking object is not changed.
	

//int hashCode( )Returns the hash code for the invoking object.
	

//boolean intersects(BitSet bitSet) Returns true if at least one pair of corresponding bits within the invoking object and bitSet are 1.
	

//boolean isEmpty( ) Returns true if all bits in the invoking object are zero.
	

//int length( ) Returns the number of bits required to hold the contents of the invoking BitSet. This value is determined by the location of the last 1 bit.
 	

//int nextClearBit(int startIndex)  Returns the index of the next cleared bit, (that is, the next zero bit), starting from the index specified by startIndex.
 	

//int nextSetBit(int startIndex) Returns the index of the next set bit (that is, the next 1 bit), starting from the index specified by startIndex. If no bit is set, -1 is returned.
 	

//void or(BitSet bitSet) ORs the contents of the invoking BitSet object with that specified by bitSet. The result is placed into the invoking object.
	

//void set(int index)Sets the bit specified by index.
	

//void set(int index, boolean v) Sets the bit specified by index to the value passed in v. True sets the bit, false clears the bit.
	

//void set(int startIndex, int endIndex) Sets the bits from startIndex to endIndex.
	

//void set(int startIndex, int endIndex, boolean v) Sets the bits from startIndex to endIndex, to the value passed in v. true sets the bits, false clears the bits.
 	

//int size( ) Returns the number of bits in the invoking BitSet object.
	
//String toString( ) Returns the string equivalent of the invoking BitSet object.
	

//void xor(BitSet bitSet) XORs the contents of the invoking BitSet object with that specified by bitSet. The result is placed into the invoking object.


  public static void main(String args[]) {
      BitSet bits1 = new BitSet(16);
      BitSet bits2 = new BitSet(16);
      
      // set some bits
      for(int i = 0; i < 16; i++) {
         if((i % 2) == 0) bits1.set(i);
         if((i % 5) != 0) bits2.set(i);
      }
     
      System.out.println("Initial pattern in bits1: ");
      System.out.println(bits1);
      System.out.println("\nInitial pattern in bits2: ");
      System.out.println(bits2);

      // AND bits
      bits2.and(bits1);
      System.out.println("\nbits2 AND bits1: ");
      System.out.println(bits2);

      // OR bits
      bits2.or(bits1);
      System.out.println("\nbits2 OR bits1: ");
      System.out.println(bits2);

      // XOR bits
      bits2.xor(bits1);
      System.out.println("\nbits2 XOR bits1: ");
      System.out.println(bits2);
   }

}
