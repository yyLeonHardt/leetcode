/*Write a function to find the longest common prefix string amongst an array of strings.*/

package leetCodeEasyPart;

public class _014LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int len = strs.length;
        int i = 0;
        String temp = null;
        if(len == 0){
        	return temp;
        }
        while(true){
        	int j = 0;
        	for(; j < len; j++){
        		if(j == 0){
        			temp = strs[j].substring(i, i + 1);
        		}else{
        			if(i >= strs[j].length() || !strs[j].substring(i, i + 1).equals(temp)){
        				break;
        			}
        		}
        	}
        	if(j == len){
        		prefix += temp;
        	}else{
        		break;
        	}
        }
        
        return prefix;
    }

	public static void main(String[] args) {
		

	}

}
