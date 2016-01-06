/*
 * Given two strings s and t, write a function to determine if t is an anagram of s.

 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */

/* Find what letters and how many of these letters separately in each string, 
 * and determine whether they are equal or not. 
 */

package leetCodeEasyPart;

import java.util.Arrays;
import java.util.Scanner;

public class _242ValidAnagram {
	
	public boolean isAnagram(String s, String t) {
		
//Method 1:        
//		int len = s.length();
//		if(t.length() != len) 
//			return false;
//		if(len == 0) 
//			return true;
//		int temp[] = new int[26];
//		
//		for(int i = 0; i < len; i++)
//			temp[s.charAt(i) - 'a']++;
//		for(int i = 0; i < len; i++)
//			temp[t.charAt(i) - 'a']--;
//		for(int i = 0; i < 26; i++)
//			if(temp[i] != 0)
//				return false;
//		
//		return true;

//Method 2:
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		Arrays.sort(sChars);
		Arrays.sort(tChars);
		return Arrays.equals(sChars, tChars);
		
    }

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String t = input.next();
		input.close();
		
		_242ValidAnagram z = new _242ValidAnagram();
		boolean flag = z.isAnagram(s, t);
		System.out.println(flag);
	}

}
