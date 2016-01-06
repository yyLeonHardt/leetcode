/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
*/

package leetCodeEasyPart;

public class _283MoveZero {
	
	public void moveZeroes(int[] nums) {
		
        int len = nums.length;
		if(nums == null || len == 0)
			return;
        
		int zeroNum = 0;
        
        for(int i = 0; i < len; i++) {
        	if(nums[i] == 0) {
        		zeroNum++;
        		continue;
        	}
        	if(zeroNum != 0) {
        		nums[i - zeroNum] = nums[i];
        	}        	
        }
        
        if(zeroNum != 0) {
        	for(int i = len - zeroNum; i < len; i++) {
        		nums[i] = 0;
        	}
        }
        
        for(int i = 0; i < len; i++) {
        	System.out.print(nums[i] + " ");
        }
    }
	

	public static void main(String[] args) {
		
		int[] input = {1};
		_283MoveZero z = new _283MoveZero();
		z.moveZeroes(input);

	}

}
