/*Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].*/
package leetCodeMediumPart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _046Permutations {
	
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        int len = nums.length;
        boolean[] flag = new boolean[len];
        for(int i = 0; i < len; i++) {
        	flag[i] = true;
        }
        for(int i = 0; i < len; i++) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(nums[i]);
            flag[i] = false;
            helpTool(nums, list, ret, flag);
            flag[i] = true;
        }
        return ret;
    }
    
    public static void helpTool(int[] nums, List<Integer> list, List<List<Integer>> ret, boolean[] flag) {
    	int len = nums.length;
    	if(list.size() == len) {
    		ret.add(list);
    		return;
    	}

    	for(int i = 0; i < len; i++) {
        	List<Integer> temp = new ArrayList<Integer>();
        	Iterator<Integer> it = list.iterator();
        	while(it.hasNext()) {
        		temp.add(it.next());
        	}
    		if(flag[i]) {
    			temp.add(nums[i]);
    			flag[i] = false;
    			helpTool(nums, temp, ret, flag);
    			flag[i] = true;
    		}
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3};
		permute(nums);
	}

}
