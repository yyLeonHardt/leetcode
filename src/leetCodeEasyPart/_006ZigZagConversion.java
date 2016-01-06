package leetCodeEasyPart;

import java.util.Scanner;

public class _006ZigZagConversion {
	
	public String convert(String s, int numRows) {
        
		String[] string = new String[numRows];
		String output = "";
		int len = s.length();
		if(len == 0) {
			return "";
		}
		if(numRows == 1) {
			return s;
		}
		int flag = 0;
		int j = 0;
		for(int i = 0; i < numRows; i++)
			string[i] = "";
		for(int i = 0; i < len; i++) {
			string[j] += String.valueOf(s.charAt(i));
			if(flag == 0 && j != numRows - 1) 
				j++;
			else if(flag == 0 && j == numRows - 1) {
				flag = 1;
				j--;
			}else if(flag == 1 && j != 0)
				j--;
			else if(flag == 1 && j == 0) {
				flag = 0;
				j++;
			}
		}
        for(int i = 0; i < numRows; i++) {
        	output += string[i];
        }
        return output;
    }

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int numRows = input.nextInt();
		input.close();
		
		_006ZigZagConversion z = new _006ZigZagConversion();
		String output = z.convert(s, numRows);
		System.out.println(output);
	}

}
