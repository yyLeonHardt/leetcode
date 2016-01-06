/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 * If the last word does not exist, return 0.

 * Note: A word is defined as a character sequence consists of non-space characters only.

 * For example, 
 * Given s = "Hello World",
 * return 5.
 */

package leetCodeEasyPart;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _058LengthOfLastWord {
	
	public int lengthOfLastWord(String s) {
		
		if(s.length() == 0 || s.equals(" ")) {
			return 0;
		}
		
		Pattern p = Pattern.compile("[\\w]+");
		Matcher m = p.matcher(s);
		
		String temp = null;
		
		while(m.find()) {
			temp = m.group();
		}
		
		if(temp == null) {
			return 0;
		}
		int len = temp.length();
		return len;
        
    }
	
	public int lengthOfLastWord2(String s) {
		
		int len = 0;
		String temp = s.trim();

		for(int i = temp.length() - 1; i >= 0; i--) {
			if(temp.charAt(i) != ' ') 
				len++;
			else
				break;
		}
		return len;
	}

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		String s = input.next();
//		input.close();

		_058LengthOfLastWord l = new _058LengthOfLastWord();
		String s = "    ";
		int i = l.lengthOfLastWord(s);
		int j = l.lengthOfLastWord2(s);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		

	}

}
