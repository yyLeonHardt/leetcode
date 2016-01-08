/*Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?*/

package leetCodeEasyPart;

public class _326PowerOfThree {
	
	
//	  Loop:
//    public boolean isPowerOfThree(int n) {
//    	if(n == 0) {
//    		return false;
//    	}
//        while(n % 3 == 0) {
//        	n /= 3;
//        }
//        return n == 1 ? true : false;
//    }

	
//	log3(n) = log10(n) / log10(3)
    public boolean isPowerOfThree(int n) {
    	return (Math.log10(n) / Math.log10(3)) % 1 == 0; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
