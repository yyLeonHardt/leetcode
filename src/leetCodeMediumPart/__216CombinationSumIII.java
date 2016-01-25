/*Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

Ensure that numbers within the set are sorted in ascending order.


Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]

Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]*/

package leetCodeMediumPart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class __216CombinationSumIII {
	
    public static List<List<Integer>> combinationSum3(int k, int n) {
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	helpTool(k, n, 1, ret, new ArrayList<Integer>());
    	return ret;
    }
    
    public static void helpTool(int k, int n, int start, List<List<Integer>> ret, List<Integer> list) {
    	if(list.size() == k && n == 0) {
    		List<Integer> temp = new ArrayList<Integer>(list);
    		ret.add(temp);
    		return;
    	}
    	
    	for(int i = start; i < 10; i++) {
    		list.add(i);
    		helpTool(k, n - i, i + 1, ret, list);
    		list.remove(list.size() - 1);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combinationSum3(3, 9);
	}

}
