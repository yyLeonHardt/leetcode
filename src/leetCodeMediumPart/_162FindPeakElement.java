/*A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ¡Ù num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -¡Þ.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.*/

package leetCodeMediumPart;

public class _162FindPeakElement {

//	  O(n):
//    public int findPeakElement(int[] nums) {
//    	int len = nums.length;
//    	if(len == 1) {
//    		return 0;
//    	}
//        for(int i = 0; i < len; i++) {
//        	if(i == 0) {
//        		if(nums[i + 1] < nums[i]) {
//        			return i;
//        		}
//        	}else {
//        		if(i == len - 1) {
//        			if(nums[i - 1] < nums[i]) {
//        				return i;
//        			}
//        		}else {
//        			if(nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
//        				return i;
//        			}
//        		}
//        	}
//        }
//        return 0;
//    }
	
//	O(log(n)):
	int ret;
	public int findPeakElement(int[] nums) {
		int len = nums.length;
		if(len == 1) {
			return 0;
		}else {
			helpTool(nums, 0, len - 1);
			return ret;
		}
	}
	
	public void helpTool(int[] nums, int left, int right) {
		if(left == right) {
			return;
		}
		int len = nums.length;
		int mid = (left + right) / 2;
		if(mid == 0) {
			if(nums[mid + 1] < nums[mid]) {
				ret = mid;
				return;
			}
		}else {
			if(mid == len - 1) {
				if(nums[mid - 1] < nums[mid]) {
					ret = mid;
					return;
				}
			}else {
				if(nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]) {
					ret = mid;
					return;
				}
			}
		}
		helpTool(nums, left, mid - 1);
		helpTool(nums, mid + 1, right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
