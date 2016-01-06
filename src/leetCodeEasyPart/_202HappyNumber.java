/*Write an algorithm to determine if a number is "happy".

 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 * Example: 19 is a happy number

 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
*/

//It is a question that require you to determine whether there is a loop or not.

package leetCodeEasyPart;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _202HappyNumber {
	
	public boolean isHappy(int n) {
		
//Method 1: Hash set cannot add same element twice, use this characteristic to judge loop.
//		Set<Integer> resultSet = new HashSet<Integer>();
//		int sum;
//		int mod;
//		while(resultSet.add(n)) {
//			sum = 0;
//			while(n > 0) {
//				mod = n % 10;
//				n /= 10;
//				sum += mod * mod;
//			}		
//			if(sum == 1)
//				return true;
//			n = sum;
//		}
//        		
//		return false;
		
//Method 2: Let one goes calculation once every time, and the other goes twice, if there is a loop, they will get same value finally.
		int fast = n;
		int slow = n;
		while(true) {
			slow = cal(fast);
			fast = cal(cal(slow));
			System.out.print("fast = " + fast + " ");
			System.out.print("slow = " + slow);
			System.out.println(" ");
			if(fast == 1)
				return true;

			if(slow == 1)
				return true;

			if(fast == slow)
				return false;
		}
	
    }
	
	public int cal(int input) {
		int n = input;
		int mod;
		int sum = 0;
		while(n > 0) {
			mod = n % 10;
			sum += mod * mod;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		_202HappyNumber z = new _202HappyNumber();
		System.out.println(z.isHappy(n));

	}

}
