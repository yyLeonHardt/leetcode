/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?*/

package leetCodeMediumPart;

public class _268MissingNumber {
	
    public int missingNumber(int[] nums) {
    	
//Method 1:
//    	if(nums == null || nums.length == 0)
//    		return 0;
//    	int sum = 0;
//    	int temp = 0;
//        for(int i = 0; i < nums.length + 1; i ++) {
//        	sum += i;
//        }
//        for(int i = 0; i < nums.length; i++) {
//        	temp += nums[i];
//        }
//        return sum - temp;
    	
//Method 2:
    	int ret = 0;
    	int i = 0;
    	for(; i < nums.length; i++)
    		ret ^= i ^ nums[i];
    	return ret ^ i;
    }

	public static void main(String[] args) {

	}

}
