/*Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.*/

package leetCodeMediumPart;

public class _153FindMinimumInRotatedSortedArray {
	
    public int findMin(int[] nums) {
    	int min = Integer.MAX_VALUE;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] < min)
    			min = nums[i];
    	}
    	return min;
    }

	public static void main(String[] args) {

	}

}
