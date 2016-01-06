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
	
	public int titleToNumber(String s) {
        
		int columnNum = 0;
		int len = s.length();
		for(int i = len - 1; i >= 0; i--){
			columnNum += (s.charAt(i) - 'A' + 1) * Math.pow(26, len - 1 - i); 
		}
		
		return columnNum;
    }

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.next();
		input.close();
		
		_171ExcelSheetColumnNumber z = new _171ExcelSheetColumnNumber();
		long a = System.currentTimeMillis();
		int columnNum = z.titleToNumber(s);
		long b = System.currentTimeMillis();
		
		System.out.println(columnNum);
		System.out.println("Run time: " + (b - a));

	}

}
