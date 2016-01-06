/*Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].*/

package leetCodeEasyPart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _228SummaryRanges {
	
    public static List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        if(nums == null || len == 0)
        	return null;
    	int i = 0;
        List<String> result = new ArrayList<String>();

        String[] strNums = new String[len];
        for(int j = 0; j < len; j++)
        	strNums[j] = String.valueOf(nums[j]);
        while(i < len) {
        	String temp = strNums[i];
        	int begin = nums[i];
        	while((i + 1 < len) && nums[i + 1] - nums[i] == 1) {
        		i++;
        	}
        	if(nums[i] != begin) {
        		temp = temp + "->" + strNums[i];
        	}
        	result.add(temp);
        	i++;

        }
        return result;
    }

	public static void main(String[] args) {
		
		int[] a = {0,1,2,4,5,7,8,10};
		List<String> output = summaryRanges(a);
		Iterator<String> i = output.iterator();
		while(i.hasNext())
			System.out.println(i.next());

	}

}
