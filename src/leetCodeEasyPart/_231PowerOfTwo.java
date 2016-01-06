/*Given an integer, write a function to determine if it is a power of two.*/

package leetCodeEasyPart;

import java.util.Scanner;

public class _231PowerOfTwo {
	
    public boolean isPowerOfTwo(int n) {

    	
//Method 1:
//    	if(n <= 0)
//    		return false;
//    	while(n > 0) {
//    		
//        	if(n == 1)
//        		return true;
//    		if(n % 2 != 0)
//    			return false;
//    		n /= 2;
//    	}
//    	
//    	return true;
    
//Method 2:
    	return ((n & n - 1) == 0 && (n > 0));
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data = input.nextInt();
		input.close();
		_231PowerOfTwo z = new _231PowerOfTwo();
		System.out.println(z.isPowerOfTwo(data));

	}

}
