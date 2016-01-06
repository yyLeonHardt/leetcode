/*The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.*/

package leetCodeEasyPart;

import java.util.Scanner;

public class _038CountAndSay {
	
	public String countAndSay(int n) {
		
		if(n == 1){
			return "1";
		}
		String result = "1";
		for(int j = 0; j < n - 1; j++){
			char[] s = result.toCharArray();
			int len = result.length();
			result = "";
			char temp;
			int flag;
			int i;
			for(i = 0; i < len - 1; i++){
				flag = 1;
				temp = s[i];
				while(i < len - 1 && temp == s[i + 1]){
					flag++;
					i++;
				}
				result += String.valueOf(flag) + String.valueOf(temp);
			}
			if(i == len - 1){
				result += "1" + String.valueOf(s[i]);
			}
		}
		
		return result;
        
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		_038CountAndSay c = new _038CountAndSay();
		c.countAndSay(n);

	}

}
