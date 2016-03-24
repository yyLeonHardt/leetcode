/*
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * */

package leetCodeEasyPart;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _217ContainsDuplicate {
	
	// Method 1(Sorting):
	// O(nlog(n)) in time
	// O(1) in space
	// 6ms - 81.45%
    public boolean containsDuplicate1(int[] nums) {
        int len = nums.length;
        if(len == 0) {
            return false;
        }
        Arrays.sort(nums);
        for(int i = 1; i < len; i++) {
            if(nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
	
    // Method 2(Set):
    // O(n) in time
    // O(n) in space
    // 9ms - 61.39%
	public boolean containsDuplicate(int[] nums) {
		
        if(nums == null || nums.length == 0) {
        	return false;
        }
		Set<Integer> num = new HashSet<Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(!num.add(nums[i]))
				return true;
		}
		return false;		
        
    }

	public static void main(String[] args) {
		

	}

}
