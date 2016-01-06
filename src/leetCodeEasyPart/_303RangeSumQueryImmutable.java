/*Given an integer array nums, find the sum of the elements between indices i and j (i ¡Ü j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.*/

package leetCodeEasyPart;

public class _303RangeSumQueryImmutable {
	
	
//  Method 1:	
//	public static class NumArray {
//		
//		int[] array;
//		
//	    public NumArray(int[] nums) {
//	        int len = nums.length;
//	        array = new int[len + 1];
//		        for(int i = 1; i < len + 1; i++) {
//		        	for(int j = i - lowbit(i) + 1; j <= i; j++) {
//		        		array[i] += nums[j - 1];
//		        	}
//		        }
//	    }
//
//	    public int sumRange(int i, int j) {
//	    	j++;
//	    	int sumI = 0;
//	    	int sumJ = 0;
//	    	while(i > 0) {
//	    		sumI += array[i];
//	    		i = i - lowbit(i);
//	    	}
//	    	while(j > 0) {
//	    		sumJ += array[j];
//	    		j = j - lowbit(j);
//	    	}
//	    	return sumJ - sumI;
//	    }
//
//	    public int lowbit(int i) {
//	    	return i & -i;
//	    }
//        
//    }
	
	public static class NumArray {
		
		int[] array;
		
		public NumArray(int[] nums) {
			int len = nums.length;
			array = new int[len];
			for(int i = 0; i < len; i++) {
				if(i == 0) {
					array[i] = nums[i];
				}else {
					array[i] = array[i - 1] + nums[i];
				}
			}
		}
		
		public int sumRange(int i, int j) {
			if(i == 0) {
				return array[j];
			}
			return array[j] - array[i - 1];
		}
	}
    
 // Your NumArray object will be instantiated and called as such:
 // NumArray numArray = new NumArray(nums);
 // numArray.sumRange(0, 1);
 // numArray.sumRange(1, 2);

	public static void main(String[] args) {
		int[] a = {-2, 0, 3, -5, 2, -1};
		NumArray d = new NumArray(a);
		System.out.println(d.sumRange(0, 2));
	}

}
