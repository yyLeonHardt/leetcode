package leetCodeEasyPart;

public class _125ValidPalindrome {
	
	public boolean isPalindrome(String s) {
		
		if(s == " "){
			return true;
		}else if(s == ""){
		    return true;
		}
		
		s = s.toLowerCase();
		
		char[] c = s.toCharArray();
		int length = c.length;
		System.out.println("len: " + length);
		int i = 0;
		int j = length - 1;
		while(i < length / 2){
			while(((int)c[i] < 97 || (int)c[i] > 122) && c[i] != '0'&& c[i] != '1'&& c[i] != '2'&& c[i] != '3'&& c[i] != '4'&& c[i] != '5'&& c[i] != '6'&& c[i] != '7'&& c[i] != '8'&& c[i] != '9'){
				i++;
				if(i > length - 1){
					return true;
				}
			}
			while(((int)c[j] < 97 || (int)c[j] > 122) && c[j] != '0'&& c[j] != '1'&& c[j] != '2'&& c[j] != '3'&& c[j] != '4'&& c[j] != '5'&& c[j] != '6'&& c[j] != '7'&& c[j] != '8'&& c[j] != '9'){
				j--;
			}
			System.out.println("c[i]: "+ c[i]);
			System.out.println("c[j]: "+ c[j]);
			if(c[i] != c[j]){
				return false;
			}
			i++;
			j--;
		}		
		return true;
	}

	public static void main(String[] args) {
		_125ValidPalindrome v = new _125ValidPalindrome();
		boolean b = v.isPalindrome("ab2a");
		System.out.println(b);

	}

}
