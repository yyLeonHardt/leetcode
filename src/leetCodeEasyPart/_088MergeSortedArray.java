/*Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.*/

package leetCodeEasyPart;

public class _088MergeSortedArray {
	
	public void merge(int A[], int m, int B[], int n) {

//Method 1:
//		if(m == 0 && n != 0){
//			for(int i = 0; i < n; i++){
//				A[i] = B[i];
//			}
//			return;
//		}else if(n == 0){
//			return;
//		}else{
//			int[] C = new int[m + n];
//			int i = 0;
//			int j = 0;
//			int k = 0;
//			for(k = 0; k < m + n; k++){
//				if(i >= m && j < n){
//					C[k] = B[j];
//					j++;
//				}else if(i < m && j >= n){
//					C[k] = A[i];
//					i++;
//				}else if(i < m && j < n && A[i] < B[j]){
//					C[k] = A[i];
//					i++;
//				}else if(i < m && j < n && A[i] >= B[j]){
//					C[k] = B[j];
//					j++;
//				}
//			}
//			for(i = 0; i < m + n; i++){
//				A[i] = C[i];
//				System.out.println(A[i]);
//			}
//			return;
//		}		
//Method 2:
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while(i >= 0 && j >= 0) {
			if(A[i] > B[j])
				A[k--] = A[i--];
			else
				A[k--] = B[j--];
		}
		if(j >= 0) {
			for(i = j; i >= 0; i--) {
				A[k--] = B[i];
			}
		}

 
    }

	public static void main(String[] args) {
		int[] a = new int[100];
		a[0] = 1;
		int b[] = {2};
		_088MergeSortedArray m = new _088MergeSortedArray();
		m.merge(a, 1, b, 1);

	}

}
