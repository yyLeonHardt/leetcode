/*Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.*/

/*要注意进位的情况，有可能出现原数组只有两位但进位后出现三位数的情况。*/

package leetCodeEasyPart;

public class _066PlusOne {

	public int[] plusOne(int[] digits) {
        
		int len = digits.length;
		int[] newD = new int[len + 1];
		int j;
		for(int i = 0; i < len; i++){
			j = len - 1 - i;
			newD[i] = digits[j];
		}
		
		j = 0;
		while(newD[j] == 9){
			newD[j] = 0;
			j++;
		}
		
		newD[j]++;
		
		if(newD[len] != 0){
			int[] output = new int[len + 1];
			for(int i = 0; i < len + 1; i++){
				j = len - i;
				output[i] = newD[j];
				System.out.println(output[i]);
			}
			return output;
		}else{
			int[] output = new int[len];
			for(int i = 0; i < len; i++){
				j = len - 1 - i;
				output[i] = newD[j];
				System.out.println(output[i]);
			}
			return output;
		}	
    }
	
	public static void main(String[] args) {
		
		_066PlusOne p = new _066PlusOne();
		int[] a = {0};
		p.plusOne(a);
		
	}

}
