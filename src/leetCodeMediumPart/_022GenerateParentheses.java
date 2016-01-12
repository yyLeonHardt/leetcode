/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

"((()))", "(()())", "(())()", "()(())", "()()()"*/

package leetCodeMediumPart;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class _022GenerateParentheses {
	
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<String>();
        if(n == 0) {
        	return ret;
        }
        String s = "(";
        helpTool(s, 1, 0, n, ret);
        return ret;
    }
    
    public void helpTool(String s, int left, int right, int n, List<String> list) {
    	if(left == n && right == n) {
    		list.add(s);
    	}
    	String temp = s;
    	if(left > right) {
    		temp += ")";
    		helpTool(temp, left, right + 1, n, list);
    	}
    	temp = s;
    	if(left < n) {
    		temp += "(";
    		helpTool(temp, left + 1, right, n, list);
    	}
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
