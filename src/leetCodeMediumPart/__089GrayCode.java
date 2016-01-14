/*The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2
Note:
For a given n, a gray code sequence is not uniquely defined.

For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.*/

package leetCodeMediumPart;

import java.util.ArrayList;
import java.util.List;

public class __089GrayCode {

    public List<Integer> grayCode1(int n) {
    	List<Integer> ret = new ArrayList<Integer>();
    	if(n < 0) {
    		return ret;
    	}
    	ret.add(0);
    	if(n == 0){
    		return ret;
    	}
    	ret.add(1);
    	for(int i = 1; i < n; i++) {
    		int size = ret.size();
    		for(int j = size - 1; j >= 0; j--) {
    			int temp = 1 << i | ret.get(j);
    			ret.add(temp);
    		}
    	}
    	return ret;
    }
    
    public List<Integer> grayCode2(int n) {
    	List<Integer> ret = new ArrayList<Integer>();
    	for(int i = 0; i < (1 << n); i++) {
    		ret.add(i ^ (i >> 1));
    	}
    	return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
