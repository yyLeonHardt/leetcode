/*Given an Iterator class interface with methods: next() and hasNext(), design and implement a PeekingIterator that support the peek() operation -- it essentially peek() at the element that will be returned by the next call to next().

Here is an example. Assume that the iterator is initialized to the beginning of the list: [1, 2, 3].

Call next() gets you 1, the first element in the list.

Now you call peek() and it returns 2, the next element. Calling next() after that still return 2.

You call next() the final time and it returns 3, the last element. Calling hasNext() after that should return false.*/

package leetCodeMediumPart;

import java.util.Iterator;

public class _284PeekingIterator {
	
	class PeekingIterator implements Iterator<Integer> {

		private Integer next;
		private Iterator<Integer> iter;
		
		public PeekingIterator(Iterator<Integer> iterator) {
		    // initialize any member here.
			iter = iterator;
			if(iter.hasNext()) {
				next = iter.next();			
			}else {
				next = null;
			}

		    
		}

	    // Returns the next element in the iteration without advancing the iterator.
		public Integer peek() {
	        return next;
		}

		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		public Integer next() {
			int ret = next;
			if(iter.hasNext()) {
				next = iter.next();
			}else {
				next = null;
			}
			return ret;
		}

		@Override
		public boolean hasNext() {
		    return (next != null);
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
