import java.util.NoSuchElementException;

public interface Queue<E>
{    
	
	//**************
	// Methods
	//**************
	 /**
	  * size()
	  * retrieves the size of the data structure of the implemented 
	  * 	Queue object
	  * @return size field indicated by the java Queue class
	  */
      public int size();

      /**
       * isEmpty()
       * asserts whether the array has a size of zero or not
       * @returns true upon success
       */
      public boolean isEmpty();
      
      /**
       * toArray()
       * method acts as a bridge between array-based and collection-based
       * 	APIs
       * @returns an array containing all of the elements in this collection
       */
      public Object[] toArray();

      /**
       * inserts the specified element e into this queue,
       * 	if it is possible to do so
       * @param e   the element to add
       * @returns true upon success
       * @throws NullPointerException if e is null
       */
      public boolean add(E e);

      /**
       * remove(E)
       * retrieves and removes the head of this queue
       * @returns the head of this queue
       * @throws NoSuchElementException  if this queue is empty
       */
      public boolean remove(E o);

      /**
       * clear()
       * removes all of the elements from the collection.  The collection
       * will be empty after this method returns.
       * @throws UnsupportedOperationException if the clear operation
       * 	is not supported by the collection
       */
      public void clear();
      
      /**
       * element()
       * retrieves, but does not remove, the head of this queue
       * @returns the head of this queue
       * @throws NoSuchElementException  if this queue is empty
       */
      public E element();
      
      /**
       * howManyQueues()
       * asserts whether 10 print requests have been processed or not
       * @returns true if the above is true
       */
      public boolean movePriorityCheck();
      
      


      
}//class Queue