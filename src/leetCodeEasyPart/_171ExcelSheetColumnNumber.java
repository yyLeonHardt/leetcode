/*
 * Related to question Excel Sheet Column Title

 * Given a column title as appear in an Excel sheet, return its corresponding column number.

 * For example:

 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28 
 */

/*实际上是26进制转换成10进制的问题*/
package leetCodeEasyPart;

import java.util.Scanner;

public class _171ExcelSheetColumnNumber {
	
	// Method 1:
	// O(n) in time
	// O(n) in space
	// 3ms - 11.24%
    public int titleToNumber1(String s) {    	
        int colNum = 0;
        char[] sChar = s.toCharArray();
        int len = sChar.length;
        for(int i = len - 1; i >= 0; i--) {
            colNum += Math.pow(26, len - 1 - i) * (sChar[i] - 'A' + 1);  
        }
        return colNum;        
    }
    
    // Method 2:
	// O(n) in time
	// O(n) in space
	// 3ms - 11.24%
    public int titleToNumber2(String s) {
        char[] sChar = s.toCharArray();
        int len = sChar.length;
        int colNum = 0;
        for(int i = 0; i < len; i++) {
            colNum *= 26;
            colNum += sChar[i] - 'A' + 1;
        }
        return colNum;
    }

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.next();
		input.close();
		
		_171ExcelSheetColumnNumber z = new _171ExcelSheetColumnNumber();
		long a = System.currentTimeMillis();
		int columnNum = z.titleToNumber1(s);
		long b = System.currentTimeMillis();
		
		System.out.println(columnNum);
		System.out.println("Run time: " + (b - a));

	}

}
