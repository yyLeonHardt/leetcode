/*Determine whether an integer is a palindrome. Do this without extra space.*/

package leetCodeEasyPart;

import java.util.Scanner;

public class _009PalindromeNumber {
	
	public static boolean isPalindrome(int x) {
		if(x < 0)
			return false;
		if(x != 0 && x % 10 == 0)
			return false;
		if(x < 10)
			return true;
        int temp = 0;
        while(x > temp) {
        	temp = temp * 10 + x % 10;
        	x /= 10;
        }
        if(x == temp || x == temp / 10)
        	return true;
        else
        	return false;
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		System.out.println(isPalindrome(n));

	}

}
