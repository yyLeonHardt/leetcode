/*You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?*/

package leetCodeMediumPart;

public class _048RotateImage {
	
	//Method 1:
	//Transpose the matrix first, and then reverse each row in the matrix.
	//O(n2)
    public void rotateMethod1(int[][] matrix) {
        matrixTranspose(matrix);
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
        	rowReverse(matrix[i]);
        }
    }
    
    public void matrixTranspose(int[][] matrix) {
    	int n = matrix.length;
    	int temp;
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			if(i < j) {
    				temp = matrix[i][j];
    				matrix[i][j] = matrix[j][i];
    				matrix[j][i] = temp;
    			}
    		}
    	}
    }
    
    public void rowReverse(int[] row) {
    	int n = row.length;
    	int temp;
    	for(int i = 0; i < (n >> 1); i++) {
    		temp = row[i];
    		row[i] = row[n - i - 1];
    		row[n - i - 1] = temp;
    	}
    }
    
    //Method 2:
    //Rotate Matrix one by one.
    public void rotateMethod2(int[][] matrix) {
    	int n = matrix.length;
    	int temp;
    	for(int i = 0; i < (n >> 1); i++) {
    		for(int j = i; j < n - i - 1; j++) {
    			temp = matrix[i][j];
    			matrix[i][j] = matrix[n - j - 1][i];
    			matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
    			matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
    			matrix[j][n - i - 1] = temp;
    		}
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
