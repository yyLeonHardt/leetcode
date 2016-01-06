/*
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * */

package leetCodeEasyPart;

import java.util.HashSet;
import java.util.Set;

public class _217ContainsDuplicate {
	
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
