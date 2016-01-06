/*Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.*/

package leetCodeEasyPart;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _219ContainsDuplicateII {

	public boolean containsNearbyDuplicate(int[] nums, int k) {

//Method 1:
//		Set<Integer> temp = new HashSet<Integer>();
//		for(int i = 0; i < nums.length; i++) {
//			if(i > k) {
//				temp.remove(nums[i - k - 1]);
//			}
//			if(!temp.add(nums[i]))
//				return true;
//		}
//		return false;
		
//Method 2:
		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(temp.containsKey(nums[i])) {
				if(i - temp.get(nums[i]) <= k)
					return true;
			}
			temp.put(nums[i], i);
				
		}
		return false;
    }

	public static void main(String[] args) {
		

	}

}
