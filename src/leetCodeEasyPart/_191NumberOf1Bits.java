/*Write a function that takes an unsigned integer and returns the number of ¡¯1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ¡¯11' has binary representation 00000000000000000000000000001011, so the function should return 3.*/

package leetCodeEasyPart;

import java.util.Scanner;

public class _191NumberOf1Bits {

	// Method 1:
	// Count every bit
	// O(1) in time
	// O(1) in space
	// 2ms - 2 - 12.55%
    public int hammingWeight1(int n) {
        int cnt = 0;
        for(int i = 0; i < 32; i++) {
            if((n & 1) == 1) {
                cnt++;
            }
            n = n >> 1;
        }
        return cnt;
    }
    
    // Method 2:
    // Turn off right-most 1
    // O(1) in time
    // O(1) in space 
    // 2ms - 2 - 12.55%
    public int hammingWeight2(int n) {
        int cnt = 0;
        while(n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;

    }
    
    // Method 3:
    // Use library function
    // O(1) in time
    // O(1) in space
    // 2ms - 2 - 12.55%
    public int hammingWeight3(int n) {
        return Integer.bitCount(n);
    }
	
	
	public static void main(String[] args) {
		
		_191NumberOf1Bits a = new _191NumberOf1Bits();
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		input.close();
		a.hammingWeight1((int)n);
	}

}
