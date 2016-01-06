package leetCodeEasyPart;

public class _013RomanToInteger {
	
//	public int romanToInt(String s) {
//        int output = 0;
//        if(s.equals(null)){
//        	return output;
//        }
//        int len = s.length();
//        if(len == 0){
//        	return output;
//        }
//        char[] S = s.toCharArray();
//        for(int i = 0; i < len; i++){
//        	if(S[i] == 'I'){
//        		if(i + 1 < len && S[i + 1] == 'V'){
//        			output += 4;
//        			i++;
//        		}else if(i + 1 < len && S[i + 1] == 'X' ){
//        			output += 9;
//        			i++;
//        		}else{
//        			output += 1;
//        		}
//        	}else if(S[i] == 'V'){
//        		output += 5;
//        	}else if(S[i] == 'X'){
//        		if(i + 1 < len && S[i + 1] == 'L'){
//        			output += 40;
//        			i++;
//        		}else if(i + 1 < len && S[i + 1] == 'C'){
//        			output += 90;
//        			i++;
//        		}else{
//        			output += 10;
//        		}
//        	}else if(S[i] == 'L'){
//        		output += 50;
//        	}else if(S[i] == 'C'){
//        		if(i + 1 < len && S[i + 1] == 'M'){
//        			output += 900;
//        			i++;
//        		}else if(i + 1 < len && S[i + 1] == 'D'){
//        			output += 400;
//        			i++;
//        		}else{
//        			output += 100;
//        		}
//        	}else if(S[i] == 'D'){
//        		output += 500;
//        	}else if(S[i] == 'M'){
//        		output += 1000;
//        	}
//        }
//        
//        return output;
//    }
	
    public int romanToInt(String s) {
        char[] temp = s.toCharArray();
        int cnt = 0;
        int len = temp.length;
        for(int i = 0; i < len; i++) {
            switch(temp[i]) {
                case 'I': 
                    if(i < len - 1 && temp[i + 1] == 'X')
                        cnt -= 1;
                    else
                        cnt += 1;
                    break;
                case 'V':
                    cnt += 5;
                    break;
                case 'X':
                    if(i < len - 1 && (temp[i + 1] == 'L' || temp[i + 1] == 'C'))
                        cnt -= 10;
                    else
                        cnt += 10;
                    break;
                case 'L':
                    cnt += 50;
                    break;
                case 'C':
                    if(i < len - 1 && temp[i + 1] == 'M')
                        cnt -= 100;
                    else
                        cnt += 100;
                    break;
                case 'D':
                    cnt += 500;
                    break;
                case 'M':
                    cnt += 1000;
                    break;
            }
        }
        return cnt;
    }

	public static void main(String[] args) {
		_013RomanToInteger r = new _013RomanToInteger();
		System.out.println(r.romanToInt("MDCCCLXXXIV"));
	}

}
