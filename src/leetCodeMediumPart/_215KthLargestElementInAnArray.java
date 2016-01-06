/*Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note: 
You may assume k is always valid, 1 ¡Ü k ¡Ü array's length.*/

package leetCodeMediumPart;

import java.util.Arrays;

public class _215KthLargestElementInAnArray {
	
	public int findKthLargest(int[] nums, int k) {
	    Arrays.sort(nums);
	    return nums[nums.length - k];
	}
	
	public static void main(String[] args) {
		int[] a = {2, 1, 5, 4, 3};
		Arrays.sort(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
