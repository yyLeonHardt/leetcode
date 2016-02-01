/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
For example,

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.*/

package leetCodeMediumPart;

public class _240SearchA2DMatrixII {
	
	//Method 1:
	//Traversal each element.
	//O(mn) in time.
    public boolean searchMatrixMethod1(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        for(int i = 0; i < row; i++) {
        	for(int j = 0; j < column; j++) {
        		if(matrix[i][j] == target) {
        			return true;
        		}
        	}
        }
        return false;
    }
    
    //Mehode 2:
    //Start with matrix[0][column - 1],while matrix[i][j] > target
    //j--, otherwise, i++;
    //O(m + n) in time.
    public boolean searchMatrixMethod2(int[][] matrix, int target) {
    	int row = matrix.length;
    	int column = matrix[0].length;
    	int i = 0;
    	int j = column - 1;
    	while(i < row && j >= 0) {
    		if(matrix[i][j] == target) {
    			return true;
    		}else if(matrix[i][j] > target) {
    			j--;
    		}else {
    			i++;
    		}
    	}
    	return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
