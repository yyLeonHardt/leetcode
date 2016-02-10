/*Given a set of distinct integers, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]*/

package leetCodeMediumPart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _078Subsets {
	
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i <= len; i++) {
        	addSubsets(nums, i, 0, ret, new ArrayList<Integer>());               
        }
        return ret;
    }
    
    public void addSubsets(int[] nums, int maxLen, int begin, List<List<Integer>> ret, List<Integer> list) {
    	if(maxLen == list.size()) {
    		ret.add(new ArrayList<Integer>(list));
    		return;
    	}
    	int len = nums.length;
    	for(int i = begin; i < len; i++) {
    		list.add(nums[i]);
    		addSubsets(nums, maxLen, i + 1, ret, list);
    		list.remove(list.size() - 1);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
