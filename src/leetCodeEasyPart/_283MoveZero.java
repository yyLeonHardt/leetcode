/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
*/

package leetCodeEasyPart;

public class _283MoveZero {
	
	// For every 0 element in the array, leave it along, and use a
	// mark to store non-zero index, when it meets non-zero element,
	// put it into the index place of the array and index++. Finally,
	// set all element after index as 0;
	// O(n) in time (O(n + m) actually, where m is the number of zero 
	// element)
	// O(1) in space
	public void moveZeroes1(int[] nums) {
		int len = nums.length;
		int cnt = 0;
		for(int i = 0; i < len; i++) {
			if(nums[i] != 0) {
				nums[cnt++] = nums[i];
			}
		}
		for(int i = cnt; i < len; i++) {
			nums[i] = 0;
		}
    }
	
	// Define a variable as a mark to store the index where the last 
	// non-zero element meets in the loop, and swap this element once
	// the loop meet the non-zero element.
    public void moveZeroes2(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] != 0) {
                swap(nums, i, cnt++);
            }
        }
    }
    
    public void swap(int[] nums, int index1, int index2) {
        int temp;
        temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
	

	public static void main(String[] args) {

	}

}
