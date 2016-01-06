/*Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321*/

package leetCodeEasyPart;

public class _007ReverseInteger {

    public static int reverse(int x) {
    	if(x == 0)
    		return x;
    	int output = 0;
    	String result = "";
    	int flag = 0;
    	if(x > 0)
    		flag = 1;
    	if(x < 0)
    		flag = -1;
    	while(x > 0 || x < 0) {
    		result += String.valueOf(Math.abs(x % 10));
    		x /= 10;
    	}
    	if(result.length() > 9) {
        	if(result.compareTo(String.valueOf(Integer.MAX_VALUE)) > 0)
        		return 0;
    	}

    	output = Integer.valueOf(result).intValue();
    	output *= flag;
        return output;
    }

	public static void main(String[] args) {
		System.out.println(reverse(123));

	}

}
