/*
 * Given an array of size n, find the majority element. The majority element is the element that appears more than �?n/2 �?times.

 * You may assume that the array is non-empty and the majority element always exist in the array.
*/

package leetCodeEasyPart;

public class _169MajorityElement {
	
    public int majorityElement(int[] nums) {

//Method 1:    	
//    	int temp = 0;
//    	int count = 0;
//    	Arrays.sort(nums);
//    	for(int i = 0; i < nums.length; i++){
//    		if(nums[i] == temp)
//    			count++;
//    		else {
//    			count = 1;
//    			temp = nums[i];
//    		}
//    		if(count > nums.length / 2)
//    			break;
//    	}
//    	
//    	return temp;
    	
//Method 2:
//    	Arrays.sort(nums);
//    	return nums[nums.length / 2];

//Method 3:
    	int major = 0;
    	int count = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(count == 0) {
    			major = nums[i];
    			count++;
    		}else {
    			if(major == nums[i]) 
    				count++;
    			else
    				count--;
    		}
    	}
    	
    	return major;
    }

	public static void main(String[] args) {
		
		int[] data = {1,2,3,4,5,62,2,2,2,4,2,2,2,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		_169MajorityElement z = new _169MajorityElement();
		z.majorityElement(data);
		
	}

}
