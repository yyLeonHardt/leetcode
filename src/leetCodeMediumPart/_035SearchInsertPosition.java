/*Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 ¡ú 2
[1,3,5,6], 2 ¡ú 1
[1,3,5,6], 7 ¡ú 4
[1,3,5,6], 0 ¡ú 0*/

package leetCodeMediumPart;

public class _035SearchInsertPosition {
	
    public static int searchInsert(int[] nums, int target) {
    	
    	if(nums.length == 0 || nums == null || target < nums[0])
    		return 0;
    	if(nums.length == 1) {
    		if(target == nums[0] || target < nums[0])
    			return 0;
    		else
    			return 1;
    	}
        if(target == nums[nums.length - 1])
        	return nums.length - 1;
    	for(int i = 0; i < nums.length - 1; i++) {
    		if(target == nums[i])
    			return i;
    		if(target > nums[i] && target < nums[i + 1])
    			return i + 1;
    	}
		return nums.length;
    	
    }

	public static void main(String[] args) {
		int[] a = {1};
		System.out.println(searchInsert(a, 1));
	}

}
