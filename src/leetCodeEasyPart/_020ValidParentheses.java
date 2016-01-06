/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/

package leetCodeEasyPart;

import java.util.ArrayList;
import java.util.List;

public class _020ValidParentheses {
	
	public boolean isValid(String s) {
        boolean flag = false;
        char[] S = s.toCharArray();
        List<String> temp = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++){
        	if(S[i] == '(' || S[i] == '[' || S[i] == '{'){
        		temp.add(String.valueOf(S[i]));
        	}else{
        		if(S[i] == ')'){
        			if(temp.size() == 0 || !temp.get(temp.size() - 1).equals("(")){
        				return flag;
        			}else{
        				temp.remove(temp.size() - 1);
        			}
        		}else if(S[i] == ']'){
        			if(temp.size() == 0 || !temp.get(temp.size() - 1).equals("[")){
        				return flag;
        			}else{
        				temp.remove(temp.size() - 1);
        			}
        		}else if(S[i] == '}'){
        			if(temp.size() == 0 || !temp.get(temp.size() - 1).equals("{")){
        				return flag;
        			}else{
        				temp.remove(temp.size() - 1);
        			}
        		}
        	}
        }
        if(temp.size() != 0){
        	return flag;
        }
        flag = true;
        return flag;
    }

	public static void main(String[] args) {
		_020ValidParentheses v = new _020ValidParentheses();
		System.out.println(v.isValid("{]"));
		

	}

}
