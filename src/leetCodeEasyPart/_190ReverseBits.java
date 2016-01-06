/*Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).*/

package leetCodeEasyPart;

import java.util.Scanner;

public class _190ReverseBits {

	public int reverseBits(int n) {
        int reversed = 0;
        long sum = 0;
        String bi = Integer.toBinaryString(n);

        int len = bi.length();
        for(int i = 0; i < 32 - len; i++){
        	bi = "0" + bi;
        }
        
        char[] c = bi.toCharArray();
        char temp;
        
        for(int i = 0; i < 16; i++){
        	temp = c[i];
        	c[i] = c[31 - i];
        	c[31 - i] = temp;
        }
        
        for(int i = 0; i < 32; i++){
        	sum += ((int)c[31 - i] - 48) * Math.pow(2, i);
        }
        
        reversed = (int)sum;   
        
        return reversed;
    }
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextInt();		
		input.close();
		_190ReverseBits r = new _190ReverseBits();
		r.reverseBits((int)n);
		

	}

}
