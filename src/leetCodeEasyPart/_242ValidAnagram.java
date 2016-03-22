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
	
    // Method 1:
    // O(n) in time
    // O(1) in space
    // 5ms - 84.75%
    public boolean isAnagram1(String s, String t) {
        if(s == null && t == null) {
            return true;
        }else if(s != null && t != null) {
            int len = s.length();
            if(len != t.length()) {
                return false;
            }
            int[] mark = new int[26];
            char[] sChar = s.toCharArray();
            char[] tChar = t.toCharArray();
            for(char c : sChar) {
                mark[c - 'a']++;
            }
            for(char c : tChar) {
                if(mark[c - 'a'] > 0) {
                    mark[c - 'a']--;
                }else {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
		
    // Method 2:
    // O(nlog(n)) in time
    // O(1) in space
    // 8ms - 46.36%
	public boolean isAnagram2(String s, String t) {
		
        if(s == null && t == null) {
            return true;
        }else if(s != null && t != null) {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            Arrays.sort(sChars);
            Arrays.sort(tChars);
            if(Arrays.equals(sChars, tChars)) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
		
    }

	
	// Old Version of Method 1 - v1.1:
	// O(n) in time
	// O(1) in space
	// 7ms - 59.12%
//    public boolean isAnagram1(String s, String t) {
//        if(s == null && t == null) {
//            return true;
//        }else if(s != null && t != null) {
//            int len = s.length();
//            if(len != t.length()) {
//                return false;
//            }
//            int[] mark = new int[26];
//            for(int i = 0; i < len; i++) {
//                mark[s.charAt(i) - 'a']++;
//            }
//            for(int i = 0; i < len; i++) {
//                char temp = t.charAt(i);
//                if(mark[temp - 'a'] > 0) {
//                    mark[temp - 'a']--;
//                }else {
//                    return false;
//                }
//            }
//            return true;
//        }else {
//            return false;
//        }
//    }
    
	// Old Version of Method 1 - v1.0:
	// O(n) in time
	// O(1) in space
	// 8ms - 46.36%
//    public boolean isAnagram1(String s, String t) {
//        if(s == null && t == null) {
//            return true;
//        }else if(s != null && t != null) {
//            int len = s.length();
//            if(len != t.length()) {
//                return false;
//            }
//            int[] mark = new int[26];
//            for(int i = 0; i < len; i++) {
//                mark[s.charAt(i) - 'a']++;
//                mark[t.charAt(i) - 'a']--;
//            }
//            for(int i = 0; i < 26; i++) {
//                if(mark[i] != 0) {
//                    return false;
//                }
//            }
//        }else {
//        	return false;
//        }
//        return true;
//    }
    

    


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String t = input.next();
		input.close();
		
		_242ValidAnagram z = new _242ValidAnagram();
		boolean flag = z.isAnagram1(s, t);
		System.out.println(flag);
	}

}
