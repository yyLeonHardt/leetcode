/*Write a function that takes an unsigned integer and returns the number of ¡¯1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ¡¯11' has binary representation 00000000000000000000000000001011, so the function should return 3.*/

package leetCodeEasyPart;

import java.util.Scanner;

public class _191NumberOf1Bits {

	public int hammingWeight(int n) {
        
		int weight = 0;
        
        for(int i = 0; i < 32; i++){
        	if((n & 1) == 1){
        		weight++;
        	}
        	n = n >> 1;
        }
        System.out.println(weight);
        return weight;
    }
	
	
	public static void main(String[] args) {
		
		_191NumberOf1Bits a = new _191NumberOf1Bits();
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		input.close();
		a.hammingWeight((int)n);
	}

}
