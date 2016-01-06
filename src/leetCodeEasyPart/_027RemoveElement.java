/*Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.*/

package leetCodeEasyPart;

public class _027RemoveElement {

	public int removeElement(int[] A, int elem) {
		int len = A.length;
		if(len == 0){
			return 0;
		}
		int newLen = len;
		for(int i = 0; i < len; i++){
			if(A[i] == elem){
				newLen--;
			}
		}
		int[] temp = new int[newLen];
		int j = 0;
		for(int i = 0; i < len; i++){
			if(A[i] != elem){
				temp[j] = A[i];
				j++;
			}
		}
		for(int i = 0; i < newLen; i++){
			A[i] = temp[i];
		}
		
		return newLen;
        
    }
	
	public static void main(String[] args) {
		_027RemoveElement r = new _027RemoveElement();
		int[] A = {4, 5};
		r.removeElement(A, 4);

	}

}
