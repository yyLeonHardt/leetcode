/*Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".*/

package leetCodeEasyPart;

public class _067AddBinary {
	
	public String addBinary(String a, String b) {
		
		String sum = "";
		int lenA = a.length();
		int lenB = b.length();
		if(lenA == 0){
			return b;
		}else if(lenB == 0){
			return a;
		}
		int lenSum = lenA + 1;
		if(lenA < lenB){
			lenSum = lenB + 1;
			for(int i = 0; i < lenB - lenA; i++){
				a = "0" + a;
			}
		}else if(lenA > lenB){
			for(int i = 0; i < lenA - lenB; i++){
				b = "0" + b;
			}
		}
		
		char[] A = a.toCharArray();
		char[] B = b.toCharArray();
		int flag = 0;
		int add = 0;
		for(int i = lenSum - 2; i >= 0; i--){
			add = ((int)A[i] - 48) + ((int)B[i] - 48) + flag;
			if(add == 3){
				sum = "1" + sum;
				flag = 1;
			}else if(add == 2){
				sum = "0" + sum;
				flag = 1;
			}else{
				sum = String.valueOf(add) + sum;
				flag = 0;
			}
		}
		if(flag == 1){
			sum = "1" + sum;
		}
		
		return sum;
	
    }

	public static void main(String[] args) {
		_067AddBinary add = new _067AddBinary();
		String a = "110";
		String b = "1";
		add.addBinary(a, b);
	}

}
