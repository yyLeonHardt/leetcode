/*Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.*/

package leetCodeMediumPart;

public class _080RemoveDuplicatesFromSortedArrayII {
	
	
	//Straightforward method
	//Use variable "newLen" to record the length of new array.
	//Variable "cnt" is marking how many times one integer appears, when 
	//one integer appears more than twice, then keep cnt == 2, and delete 
	//the integer, while another integer appears, cnt goes to 1.
	//O(n) in time
    public int removeDuplicatesMethod1(int[] nums) {
    	if(nums == null) {
    		return 0;
    	}
        int len = nums.length;
        if(len == 0) {
        	return 0;
        }
        int endOfNewArray = 0;
        int cnt = 1;
        int temp = nums[0];
        for(int i = 1; i < len; i++) {
        	if(nums[i] == temp) {
        		if(cnt < 2) {
        			cnt++;
        			nums[++endOfNewArray] = nums[i];
        		}
        	}else {
        		cnt = 1;
        		nums[++endOfNewArray] = nums[i];
        		temp = nums[i];
        	}
        }
        return ++endOfNewArray;
    }
    
    //Because the array has been sorted, every element nums[i] in new array should 
    //be bigger than nums[i - 2].
    public int removeDuplicatesMethod2(int[] nums) {
    	int len = 0;
    	for(int num : nums) {
    		if(len < 2 || num > nums[len - 2]) {
    			nums[len++] = num;
    		}
    	}
    	return len;
    }
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
