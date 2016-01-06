/*Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)*/

package leetCodeMediumPart;

public class _238ProductofArrayExceptSelf {
	
    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] ret = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
        	ret[i] = 1;
        }

        for(int i = 1; i < nums.length; i++) {
        	product *= nums[i - 1];
        	ret[i] *= product; 
        }
        product = 1;
        for(int i = nums.length - 2; i > -1; i--) {
        	product *= nums[i + 1];
        	ret[i] *= product;
        }
        return ret;
    }

	public static void main(String[] args) {
		int[] a = {12, 2, 3, 4};
		int[] b = productExceptSelf(a);
		for(int num : b)
			System.out.println(num);

	}

}
