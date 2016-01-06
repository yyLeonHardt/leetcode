/*Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.*/

package leetCodeMediumPart;

public class _053MaximumSubarray {
	
	public static int maxSubCross(int[] nums, int left, int right) {
		int mid = (left + right) / 2;
		int sum = 0;
		int leftMax = Integer.MIN_VALUE;
		int rightMax = Integer.MIN_VALUE;
		for(int i = mid; i > left - 1; i--) {
			sum += nums[i];
			if(sum > leftMax)
				leftMax = sum;
		}
		sum = 0;
		for(int i = mid + 1; i < right + 1; i++) {
			sum += nums[i];
			if(sum > rightMax)
				rightMax = sum;
		}
		return Math.max(leftMax + rightMax, Math.max(leftMax, rightMax));
	}
	
	public static int maxSub(int[] nums, int left, int right) {
		int mid = (left + right) / 2;
		if(left < right) {
			int leftMax = maxSub(nums, left, mid);
			int rightMax = maxSub(nums, mid + 1, right);
			int crossMax = maxSubCross(nums, left, right);
			return Math.max(crossMax, Math.max(leftMax, rightMax));
		}else
			return nums[left];
	}
	
    public static int maxSubArray(int[] nums) {
        return maxSub(nums, 0, nums.length - 1);
    }
	public static void main(String[] args) {
		int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(a));

	}

}
