/*Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.*/

package leetCodeEasyPart;

public class _008StringtoInteger {

	public static int myAtoi(String str) {
		if (str.length() == 0 || str == null)
			return 0;
		String temp = str.trim();
		int flag = 1;
		int result = 0;
		if(temp.length() > 0 && (temp.charAt(0) == '+' || temp.charAt(0) == '-' || temp.charAt(0) == '0')) {
			if (temp.charAt(0) == '-')
				flag *= -1;
			temp = temp.substring(1);
		}
		if(temp.length() > 0 && (temp.charAt(0) == '+' || temp.charAt(0) == '-'))
			return 0;
//		if (flag == 1) {
			for (int i = 0; i < temp.length(); i++) {
				int last = result;
/*				if (result > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
				else if (result == Integer.MAX_VALUE / 10) {
					if (Integer.valueOf(String.valueOf(temp.charAt(i))) > Integer.MAX_VALUE % 10)
						return Integer.MAX_VALUE;
				}else */
				if (temp.charAt(i) < '0' || temp.charAt(i) > '9')
					break;
				
				result = result * 10 + Integer.valueOf(String.valueOf(temp.charAt(i)));
				if (last  > result || last * 2 > result) {
					if(flag == 1) {
						return Integer.MAX_VALUE;
					} else {
						return Integer.MIN_VALUE;
					}
				}
			}
//		}else {
//			for (int i = 0; i < temp.length(); i++) {
//				if (result * flag < Integer.MIN_VALUE / 10)
//					return Integer.MIN_VALUE;
//				else if (result * flag == Integer.MIN_VALUE / 10) {
//					if (Integer.valueOf(String.valueOf(temp.charAt(i))) * flag < Integer.MIN_VALUE % 10)
//						return Integer.MIN_VALUE;
//				}else if (temp.charAt(i) < '0' || temp.charAt(i) > '9')
//					break;
//				result = result * 10 + Integer.valueOf(String.valueOf(temp.charAt(i)));
//			}
//		}
		
		return result * flag;
	}

	public static void main(String[] args) {
		System.out.println(myAtoi("10522545459"));
	}

}
