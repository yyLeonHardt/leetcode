/*
 * Given an array of size n, find the majority element. The majority element is the element that appears more than �?n/2 �?times.

 * You may assume that the array is non-empty and the majority element always exist in the array.
*/

package leetCodeEasyPart;

import java.util.Arrays;

public class _169MajorityElement {

    // Method 1(sort):
    // O(nlog(n)) in time
    // O(1) in space
    // 3ms - 38.60%
	public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
	
	
	// Method 2:
	// Count the number of element.
	// O(n) in time
	// O(1) in space
	// 2ms - 60.87%
    public int majorityElement2(int[] nums) {
        int major = nums[0];
        int cnt = 0;
        for(int num : nums) {
            if(cnt == 0) {
                major = num;
                cnt++;
            }else {
                if(num != major) {
                    cnt--;
                }else {
                    cnt++;
                }
            }
        }
        return major;
    }
	

	public static void main(String[] args) {
		
		int[] data = {1,2,3,4,5,62,2,2,2,4,2,2,2,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		_169MajorityElement z = new _169MajorityElement();
		z.majorityElement1(data);
		
	}

}
