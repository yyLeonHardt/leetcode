/*Given a string of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. The valid operators are +, - and *.


Example 1
Input: "2-1-1".

((2-1)-1) = 0
(2-(1-1)) = 2
Output: [0, 2]


Example 2
Input: "2*3-4*5"

(2*(3-(4*5))) = -34
((2*3)-(4*5)) = -14
((2*(3-4))*5) = -10
(2*((3-4)*5)) = -10
(((2*3)-4)*5) = 10
Output: [-34, -14, -10, -10, 10]*/

package leetCodeMediumPart;

import java.util.ArrayList;
import java.util.List;

public class _241DifferentWaysToAddParentheses {
	
	//Recursively
	//Divide input string into two shorter string depending on operator.
	//And calculate separately.
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ret = new ArrayList<Integer>();
        if(input == null) {
        	return ret;
        }
        int len = input.length();
        if(len == 0) {
        	return ret;
        }
        for(int i = 0; i < len; i++) {
        	char ch = input.charAt(i);
        	if(ch == '+' || ch == '-' || ch == '*') {
        		String subStr1 = input.substring(0, i);
        		String subStr2 = input.substring(i + 1);
        		List<Integer> sublist1 = diffWaysToCompute(subStr1);
        		List<Integer> sublist2 = diffWaysToCompute(subStr2);
        		for(int num1 : sublist1) {
        			for(int num2 : sublist2) {
        				ret.add(calculator(num1, num2, ch));
        			}
        		}
        	}
        }
        if(ret.size() == 0) {
        	ret.add(Integer.parseInt(input));
        }
        return ret;
    }
    
    public int calculator(int num1, int num2, char operator) {
    	int result = 0;
    	switch(operator) {
    	case '+': result = num1 + num2;
    			  break;
    	case '-': result = num1 - num2;
    			  break;
    	case '*': result = num1 * num2;
    	}
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
