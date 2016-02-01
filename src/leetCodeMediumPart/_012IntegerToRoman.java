/*Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.*/

package leetCodeMediumPart;

public class _012IntegerToRoman {

//    Method¡¡1:	
//    public static String intToRoman(int num) {
//        String ret = "";
//        int temp = num % 10;
//        num /= 10;
//        switch(temp) {
//	        case 1: ret = "I" + ret;
//	        		break;
//	        case 2: ret = "II" + ret;
//	        		break;
//	        case 3: ret = "III" + ret;
//	        		break;
//	        case 4: ret = "IV" + ret;
//	        		break;
//	        case 5: ret = "V" + ret;
//	        		break;
//	        case 6: ret = "VI" + ret;
//	        		break;
//	        case 7: ret = "VII" + ret;
//	        		break;
//	        case 8: ret = "VIII" + ret;
//	        		break;
//	        case 9: ret = "IX" + ret;
//        }
//        if(num > 0) {
//        	temp = num % 10;
//        	num /= 10;
//        	switch(temp) {
//	        case 1: ret = "X" + ret;
//    		break;
//	        case 2: ret = "XX" + ret;
//    		break;
//	        case 3: ret = "XXX" + ret;
//    		break;
//	        case 4: ret = "XL" + ret;
//    		break;
//	        case 5: ret = "L" + ret;
//    		break;
//	        case 6: ret = "LX" + ret;
//    		break;
//	        case 7: ret = "LXX" + ret;
//    		break;
//	        case 8: ret = "LXXX" + ret;
//    		break;
//	        case 9: ret = "XC" + ret;
//        	}
//        }
//        if(num > 0) {
//        	temp = num % 10;
//        	num /= 10;
//        	switch(temp) {
//	        case 1: ret = "C" + ret;
//    		break;
//	        case 2: ret = "CC" + ret;
//    		break;
//	        case 3: ret = "CCC" + ret;
//    		break;
//	        case 4: ret = "CD" + ret;
//    		break;
//	        case 5: ret = "D" + ret;
//    		break;
//	        case 6: ret = "DC" + ret;
//    		break;
//	        case 7: ret = "DCC" + ret;
//    		break;
//	        case 8: ret = "DCCC" + ret;
//    		break;
//	        case 9: ret = "CM" + ret;
//        	}
//        }
//        if(num > 0) {
//        	temp = num % 10;
//        	num /= 10;
//        	switch(temp) {
//	        case 1: ret = "M" + ret;
//    		break;
//	        case 2: ret = "MM" + ret;
//    		break;
//	        case 3: ret = "MMM" + ret;
//        	}
//        }
//        return ret;
//    }	
	
//  Method 2:
	public static String intToRoman(int num) {
		int[] weight = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		String ret = "";
		int i = 0;
		while(num > 0) {
			while(num >= weight[i]) {
				ret += roman[i];
				num -= weight[i];
			}
			i++;
		}
		return ret;
	}

	public static void main(String[] args) {
		intToRoman(3792);

	}

}
