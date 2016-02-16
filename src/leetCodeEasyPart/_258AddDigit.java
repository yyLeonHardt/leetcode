/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 * For example:

 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */

package leetCodeEasyPart;

import java.util.Scanner;

public class _258AddDigit {
	
	// Recursively
	public int addDigits(int num) {       
		int output = 0;
        while(num > 0) {
        	output += num % 10;
        	num /= 10;
        }       
        if(output > 9) {
        	output = addDigits(output);
        }
        return output;
    }
	
/*
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
*/
	
	// If an integer is like 100a+10b+c, then (100a+10b+c)%9=(a+99a+b+9b+c)%9=(a+b+c)%9.
	// O(1) in time
	// O(1) in space
	public int addDigits2 (int num){
		
		if(num == 0) 
			return 0;
		if(num % 9 == 0) {
			return 9; 
		}else {
			int output = num % 9;
			return output;
		}
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		_258AddDigit z = new _258AddDigit();
		int output1 = z.addDigits(num);
		int output2 = z.addDigits2(num);
		System.out.println("output1 = " + output1);
		System.out.println("output2 = " + output2);		
	}

}
