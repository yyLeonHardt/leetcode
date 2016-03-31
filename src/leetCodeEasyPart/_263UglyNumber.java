/*
 * Write a program to check whether a given number is an ugly number.

 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

 * Note that 1 is typically treated as an ugly number.
 */

/*Remove all the factor of 2, 3 and 5 to see what left.*/

package leetCodeEasyPart;

import java.util.Scanner;

public class _263UglyNumber {
	
	// Method 1:
	// Recursively
	// 3ms - 2 - 3.17%
    public boolean isUgly(int num) {
        if(num <= 0) {
            return false;
        }
        if(num % 2 == 0) {
            return isUgly(num / 2);
        }
        if(num % 3 == 0) {
            return isUgly(num / 3);
        }
        if(num % 5 == 0) {
            return isUgly(num / 5);
        }
        return num == 1;
    }
	
	// Method 2:
	// Iteratively
	// 2ms - 1 - 17.06%
    public boolean isUgly1(int num) {
        if(num <= 0) {
            return false;
        } // Consider all numbers not only positive numbers. 
        while(num % 2 == 0) {
            num /= 2;
        }
        while(num % 3 == 0) {
            num /= 3;
        }
        while(num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }

	public static void main(String[] args) {
		
		System.out.println("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		_263UglyNumber u = new _263UglyNumber();
		boolean output = u.isUgly1(num);
		System.out.println(output);
	}

}
