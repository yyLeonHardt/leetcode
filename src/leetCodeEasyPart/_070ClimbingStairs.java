/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/

package leetCodeEasyPart;

import java.util.Scanner;

public class _070ClimbingStairs {
	
	// Method 1:
	// Recursively
	// O(n) in time
	// O(n) in space
	// Time Limited Exceeded when n > 42
    public int climbStairs1(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    
    // Method 2:
    // Iteratively
    // O(n) in time
    // O(n) in space
    // 0ms - 1 - 13.04%
    public int climbStairs2(int n) {
        int[] ways = new int[n + 1];
        if(n <= 2) {
            return n;
        }
        ways[0] = 0;
        ways[1] = 1;
        ways[2] = 2;
        for(int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n];
    }
	
    // Method 3:
    // Iteratively
    // O(n) in time
    // O(1) in space
    // 0ms - 1 - 13.04%
    public int climbStairs(int n) {
        int f0 = 0;
        int f1 = 1;
        for(int i = 1; i <= n; i++) {
            f1 = f1 + f0;
            f0 = f1 - f0;
        }
        return f1;
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();		
		input.close();
		
		_070ClimbingStairs c = new _070ClimbingStairs();
		int ways = c.climbStairs1(i);
		System.out.println(ways);
		
	}

}
