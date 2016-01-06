/*Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.*/

package leetCodeEasyPart;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _290WordPattern {
	
    public static boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<Character, String>();
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(str);
        String temp = null;
        for(int i = 0; i < pattern.length(); i++) {
        	if(m.find()){
        		temp = m.group(0);
        		if(map.containsKey(pattern.charAt(i))) {
        			if(!map.get(pattern.charAt(i)).equals(temp))
        				return false;
        		}else if(map.containsValue(temp)) {
        			return false;
        		}else
        			map.put(pattern.charAt(i), temp);
        		
        	}else {
        		return false;
        	}        	
        }
        if(m.find())
        	return false;
        return true;
        
    }

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog dog dog dog"));

	}

}
