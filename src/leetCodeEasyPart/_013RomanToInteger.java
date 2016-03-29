/*Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.*/

package leetCodeEasyPart;

import java.util.HashMap;
import java.util.Map;

public class _013RomanToInteger {
	
	// Method 1:
	// O(n) in time
	// O(n) in space
	// 6ms - 97.91%
    public int romanToInt1(String s) {
        int sum = 0;
        char[] c = s.toCharArray();
        int len = c.length;
        for(int i = 0; i < len; i++) {
            switch(c[i]) {
                case 'I': 
                    if(i < len - 1 && (c[i + 1] == 'V' || c[i + 1] == 'X')) {
                        sum -= 1;
                    }else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if(i < len - 1 && (c[i + 1] == 'L' || c[i + 1] == 'C')) {
                        sum -= 10;
                    }else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if(i < len - 1 && (c[i + 1] == 'D' || c[i + 1] == 'M')) {
                        sum -= 100;
                    }else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
    }
    
    
    // Method 2:
    // O(n) in time
    // O(1) in space
    // 18ms - 24.09%
    public int romanToInt2(String s) {
        char[] c = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = c.length;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            if(i < len - 1 && map.get(c[i]) < map.get(c[i + 1])) {
                sum -= map.get(c[i]);
            }else {
                sum += map.get(c[i]);
            }
        }
        return sum;
    }


	public static void main(String[] args) {
		_013RomanToInteger r = new _013RomanToInteger();
		System.out.println(r.romanToInt1("MDCCCLXXXIV"));
	}

}
