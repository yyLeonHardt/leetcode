/*Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/

package leetCodeMediumPart;

public class _136SingleNumber {
	
    public static int singleNumber(int[] nums) {
        int ret = 0;
        for(int i = 0; i < nums.length; i++)
        	ret ^= nums[i];
        return ret;
    }

	public static void main(String[] args) {
		
		int[] a = {1, 2, 1, 3, 2, 5};
		System.out.println(singleNumber(a));

	}

}
