/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.*/

package leetCodeMediumPart;

public class _074Searcha2DMatrix {
	
//  Method 1:
	public boolean searchMatrix(int[][] matrix, int target) {
    	int row = matrix.length;
    	int col = matrix[0].length;
    	if(target < matrix[0][0] || target > matrix[row - 1][col - 1]) {
    		return false;
    	}
    	if(target >= matrix[row - 1][0]) {
    		return helpTool(matrix, row - 1, target);
    	}
    	if(row == 1) {
    	    return helpTool(matrix, 0, target);
    	}
    	int up = 0;
    	int down = row - 1;
    	int mid = 0;
    	while(up <= down) {
    	    mid = (up + down) >> 1;
    		if(target < matrix[mid][0]) {
    			down = mid - 1;
    		}else if(target == matrix[mid][0]) {
    		    return true;
    		}else if(target > matrix[mid][0] && target < matrix[mid + 1][0]) {
    			return helpTool(matrix, mid, target);
    		}else if(target > matrix[mid][0]) {
    			up = mid + 1;
    		}
    	}
    	return false;
    }
    
    public boolean helpTool(int[][] matrix, int row, int target) {
    	int col = matrix[0].length;
    	int left = 0;
    	int right = col - 1;
    	int mid = 0;
    	while(left <= right) {
    	    mid = (left + right) >> 1;
    		if(matrix[row][mid] == target) {
    			return true;
    		}else if(matrix[row][mid] > target) {
    			right = mid - 1;
    		}else if(matrix[row][mid] < target) {
    			left = mid + 1;
    		}
    	}
    	return false;
    }
	
//	 Method 2:
//	public boolean searchMatrix(int[][] matrix, int target) {
//		int row = matrix.length;
//		int col = matrix[0].length;
//		int left = 0;
//		int right = row * col - 1;
//		int mid = 0;
//		int mid_value = 0;
//		if(row == 1 & col == 1) {
//		    if(target == matrix[0][0]) {
//		        return true;
//		    }else {
//		        return false;
//		    }
//		}
//		while(left <= right) {
//			mid = (left + right) >> 1;
//			mid_value = matrix[mid / col][mid % col];
//			if(mid_value == target) {
//				return true;
//			}else if(target > mid_value) {
//				left = mid + 1;
//			}else {
//				right = mid - 1;
//			}
//		}
//		return false;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
