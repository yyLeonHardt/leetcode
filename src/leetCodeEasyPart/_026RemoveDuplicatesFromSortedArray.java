/*Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].*/

package leetCodeEasyPart;

public class _026RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] A) {
		
		int len = A.length;
		if(len == 0){
			return 0;
		}
		if(len == 1){
			return 1;
		}
		int newLen = 1;
		int temp = A[0];
		for(int i = 1; i < len; i++){
			if(A[i] != temp){
				temp = A[i];
				newLen++;
				A[newLen - 1] = temp;

			}
		}
		
		return newLen;
        
    }
	
	public static void main(String[] args) {
		
		_026RemoveDuplicatesFromSortedArray r = new _026RemoveDuplicatesFromSortedArray();
		int[] A = {1, 2};
		r.removeDuplicates(A);

	}

}
