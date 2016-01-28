package leetCodeMediumPart;

import java.util.ArrayList;
import java.util.List;

public class _077Combinations {
		
	//Recursion
	//O(n2)
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();      	
        getCombine(0, n, k, new ArrayList<Integer>(), ret);
        return ret;
    }
    
    public void getCombine(int start, int n, int k, List<Integer> list, List<List<Integer>> ret) {
    	if(list.size() == k) {
    		List<Integer> temp = new ArrayList<Integer>(list);
    		ret.add(temp);
    	}
    	for(int i = start + 1; i <= n; i++) {
    		list.add(i);
    		getCombine(i, n, k, list, ret);
    		list.remove(list.size() - 1);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
