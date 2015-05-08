/**
 * Printer Class
 * @author hinchman17
 * Implements the Queue class, as well as the methods that determine
 * the status of the printer.
 */
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;


public class Printer implements Queue <PrintRequest>
{
	  //**************
	  // Field
	  //************** 
		/**
		 * MAX_TIME
		 */
		private int MAX_TIME = 1000;
		/**
		 * MAX_SIZE
		 */
		// maximum size of each 
		private int MAX_SIZE = 10;
		private int INITIAL_CAPACITY;
		private int counter;
		/**
		 * queue
		 */
		// creation of an object queue
	    private PriorityQueue<PrintRequest> queue =
	    		new PriorityQueue<PrintRequest>(MAX_SIZE);
    	List<Object> operatingSystem; 
	    
	    
	  //**************
	  // Constructors
	  //**************
	    /**
	     * Printer
	     * default constructor as indicated by the object creation and 
	     * 	its input
	     * @return new Printer object
	     */
	    public Printer() {
	    	
	    	
	    	/*counter = 0;

	    	operatingSystem = new ArrayList<Object>(20);
	    	//populate the system
	    	for (int i = 0; i < 20; i++) {
	    		operatingSystem.add(queue);	 */   	
	    	}// for 
	      
	    }// Queue()

	  //**************
	  // Methods
	  //**************
	      /**
	       * @return returns true if the printer currently is not processing
	       *        a print request, and false if the printer is busy 
	       *        processing a Print Request
	       */
	      public boolean printerIdle() {
	    	  if ()
	      }
	      
	      /**
	       * @return if the printer is idle, the printer will start processing
	       *        the given print request, and the method returns true.  If
	       *        the printer is already processing another PrintRequest,
	       *        the new PrintRequest pr is ignored and the method returns
	       *        false   
	       */
	      public boolean printFile(PrintRequest pr) {
	        if (printerIdle() == true) {
	        	operatingSystem.add(queue);
	        	processForOneUnit();
	        	return true;
	        }
	        else return false;
	      }
	      
	      public PrintRequest processForOneUnit() {
	    	  if (printerIdle() == )
	      }
	      
		  //***********************************
		  // Implementation of the Queue Class
		  //***********************************
	 	 /**
	 	  * size()
	 	  * retrieves the size of the data structure of the implemented 
	 	  * 	Queue object
	 	  * @precondition none
	 	  * @postcondition none
	 	  * @return size field indicated by the java Queue class
	 	  */
	      public int size() {
	           return queue.size();
	      }// size()

	      /**
	       * isEmpty()
	       * asserts whether the array has a size of zero or not
	       * @precondition none
	       * @postcondition none
	       * @returns true upon success
	       */
	      public boolean isEmpty()
	      {
	        if (queue.size() == 0) {
	          return true;
	        }// if
	        else return false;
	      }// isEmpty()

	      /**
	       * toArray()
	       * method acts as a bridge between array-based and collection-based
	       * 	APIs
	       * @precondition must be an existing array
	       * @postcondition collection converts to an array
	       * @returns an array containing all of the elements in this collection
	       */
	      public Object[] toArray()
	      {
	        return queue.toArray();
	      }

	      /**
	       * inserts the specified element e into this queue,
	       * if it is possible to do so
	       * @param e   the element to add
	       * @precondition PrintRequest exists and Printer is initialized
	       * @precondition size of the counter increases for the queue
	       * @returns true upon success
	       * @throws NullPointerException if e is null
	       */
	      public boolean add(PrintRequest e)
	      {
	    	  counter++;
	    	  int pages = e.getPages();
	    	  switch(pages) {
	    	  	case 1:
	    	  		queue1.add
	    	  		break;
	    	  	case 2:
	    	  		break;
	    	  	case 3:
	    	  		break;
	    	  	case 4:
		    		break;
		    	case 5:
		    	    break;
		    	case 6:
		    	  	break;
	    	  	case 7:
	    	  		break;
	    	  	case 8:
		    		break;
		    	case 9:
		    	    break;
		    	case 10:
		    	  	break;
		    	  	
	    	  }
	    	  return queue.add(e);
	      }

	      /**
	       * remove(E)
	       * retrieves and removes the head of this queue
	       * @precondition PrintRequest must be a valid element in the 
	       * 	object array
	       * @postcondition element at the front of the queue is removed,
	       * 	size decrements by 1
	       * @returns the head of this queue
	       * @throws NoSuchElementException  if this queue is empty
	       */
	      public boolean remove(PrintRequest o)
	      {
	        if(queue.isEmpty())
	          throw new NoSuchElementException();
	        arrDeq.remove();
	        return arrDeq.poll() != null;
	      }// remove()

	      /**
	       * clear()
	       * removes all of the elements from the collection.  The collection
	       * will be empty after this method returns.
	       * @precondition none
	       * @postcondition the queue is now empty
	       * @throws UnsupportedOperationException if the clear operation
	       * 	is not supported by the collection
	       */
	      public void clear()
	      {
	        if (arrDeq.isEmpty()) {
	          System.out.println(arrDeq);
	        }
	        else arrDeq.clear();
	      }// clear()
	      
	      /**
	       * element()
	       * retrieves, but does not remove, the head of this queue
	       * @precondition none
	       * @postcondition the queue is unchanged
	       * @returns the head of this queue
	       * @throws NoSuchElementException  if this queue is empty
	       */
	      public PrintRequest element()
	      {
	        if(arrDeq.isEmpty())
	          throw new NoSuchElementException();
	        return arrDeq.element();
	      }// element()
	      
	      /**
	       * howManyQueues()
	       * asserts whether 10 print requests have been processed or not
	       * @returns true if the above is true
	       */
	      public boolean movePriorityCheck(){
	    	  if ()
	    		  else return false;
	      }// movePriorityCheck()


}// class Printer 