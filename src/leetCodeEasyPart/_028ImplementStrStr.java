package leetCodeEasyPart;

public class _028ImplementStrStr {
	
	public int strStr(String haystack, String needle) {
        
		int index = -1;
		int len = needle.length();
		if(haystack.length() == 0 && len == 0){
			return 0;
		}
		if(len == 0){
			return 0;
		}
		if(haystack == null || needle == null || haystack.length() < len){
			return index;
		}
		char[] Needle = needle.toCharArray();		
		int temp = 0;
		String subString = null;
		String substitude = haystack;
		while(substitude.length() >= len){
			temp = substitude.indexOf(Needle[0]);
			if(temp == -1){
				return index;
			}
			
			try{
				subString = substitude.substring(temp, temp + len);
			}catch(StringIndexOutOfBoundsException e){
				break;
			}
			
			substitude = substitude.substring(temp + 1);		
			char[] SubString = subString.toCharArray();
			int i = 0;
			for(; i < len; i++){
				if(Needle[i] != SubString[i]){
					break;
				}
			}
			if(i == len){
				index = haystack.length() - substitude.length() - 1;
				break;
			}
		}
		
		System.out.println(index);
		return index;
    }

	public static void main(String[] args) {
		_028ImplementStrStr i = new _028ImplementStrStr();
		i.strStr("bbbbbbbab", "ab");

	}

}
