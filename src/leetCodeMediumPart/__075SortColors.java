/*Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.*/

package leetCodeMediumPart;

public class __075SortColors {
	
    public void sortColors(int[] nums) {
    	if(nums.length == 0 || nums == null)
    		return;
        int[] temp = new int[3];
        for(int i = 0; i < nums.length; i++)
        	temp[nums[i]]++;
        for(int i = 0; i < nums.length; i++) {
        	if(temp[0] != 0) {
        		nums[i] = 0;
        		temp[0]--;
        	}else if(temp[1] != 0) {
        		nums[i] = 1;
        		temp[1]--;
        	}else {
        		nums[i] = 2;
        		temp[2]--;
        	}
        }
        
    }

	public static void main(String[] args) {

	}

}
