/*Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/

package leetCodeMediumPart;

public class _137SingleNumberII {
	
    public int singleNumber(int[] nums) {
    	int ones = 0;
    	int twos = 0;
    	int threes = 0;
        for(int i = 0; i < nums.length; i++) {
        	ones ^= nums[i];
        	twos |= ones & nums[i];
        	threes = ones & twos;
        	ones &= ~threes;
        	twos &= ~threes;
        }
        
        return ones | twos;
    }

	public static void main(String[] args) {


	}

}
