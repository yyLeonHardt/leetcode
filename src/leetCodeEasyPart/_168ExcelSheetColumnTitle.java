/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB */

package leetCodeEasyPart;

public class _168ExcelSheetColumnTitle {
	
    public static String convertToTitle(int n) {
    	String title = "";
        int remainder = 0;
        while(n > 0) {
        	remainder = n % 26;
        	if(remainder == 0) {
        		title = "Z" + title;
        		n = n / 26 - 1;
        	}else {
        	    title = String.valueOf((char)(remainder + 64) + title);
        	    n /= 26;
        	}
        		
        	
        }
        return title;
    }

	public static void main(String[] args) {
		System.out.println(convertToTitle(52));

	}

}
