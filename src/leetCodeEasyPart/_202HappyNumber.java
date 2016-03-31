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
	
	// Method 1:
	// Hash set cannot add same element twice, use this characteristic to judge loop.
	// 6ms - 6 - 26.98%
    public boolean isHappy1(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(set.add(n)) {
            int sum = 0;            
            int mod = 0;
            while(n != 0) {
                mod = n % 10;
                sum += mod * mod;
                n /= 10;
            }
            if(sum == 1) {
                return true;
            }
            n = sum;
        }
        return false;
    }
    
    // Method 2:
    // Let one goes calculation once every time, and the other goes twice, 
    // if there is a loop, they will get same value finally.
    // 2ms - 2 - 84.07%
    public boolean isHappy2(int n) {
        int fast = n;
        int slow = n;
        while(true) {
            fast = cal(cal(fast));
            slow = cal(slow);
            if(fast == 1 || slow == 1) {
                return true;
            }
            if(fast == slow) {
                return false;
            }
        }
    }
    
    // Method 3:
    // Recusively
    // 1ms - 1 - 99.17%
    public boolean isHappy3(int n) {
        if(n < 10) {
            if(n == 1 || n == 7) {
                return true;
            }else {
                return false;
            }
        }else {
            return isHappy3(cal(n));
        }
    }
    
    // Method 4:
    // Iteratively
    // 2ms - 2 - 84.07%
    public boolean isHappy4(int n) {
        while(n >= 10) {
            n = cal(n);
        }
        return n == 1 || n == 7;
    }
    
    public int cal(int n) {
        int sum = 0;
        int mod = 0;
        while(n != 0) {
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
		System.out.println(z.isHappy1(n));

	}

}
