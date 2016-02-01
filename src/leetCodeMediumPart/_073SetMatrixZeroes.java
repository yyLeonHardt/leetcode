/*Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

click to show follow up.

Follow up:
Did you use extra space?
A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?*/

package leetCodeMediumPart;

public class _073SetMatrixZeroes {
	
	//Method 1:
	//Create a new matrix to mark where the 0 is in the matrix, and 
	//then check one by one for the mark matrix and change value in 
	//original matrix if it fit the requirement.
	//O(mn) in space, O(mn) in time.
    public void setZeroesMethod1(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] mark = new int[row][column];
        for(int i = 0; i < row; i++) {
        	for(int j = 0; j < column; j++) {
        		if(matrix[i][j] == 0) {
        			mark[i][j] = 1;
        		}
        	}
        }
        
        for(int i = 0; i < row; i++) {
        	for(int j = 0; j < column; j++) {
        		if(mark[i][j] == 1) {
        			setRowAndColumnZeroes(matrix, i, j);
        		}
        	}
        }
    }
    
    public void setRowAndColumnZeroes(int[][] matrix, int x, int y) {
    	int row = matrix.length;
    	int column = matrix[0].length;
    	for(int i = 0; i < row; i++) {
    		matrix[i][y] = 0;
    	}
    	for(int j = 0; j < column; j++) {
    		matrix[x][j] = 0;
    	}
    }
    
    //Method 2:
    //For improvement, we just need to know whether every row and column
    //occurs zero at least once. Because no matter how many time the zero
    //occur in one row, all the element of this row should become zero.
    //So we just need to mark rows and columns instead mark each element
    //in the matrix.
    //O(m + n) in space, O(mn) in time.
    public void setZeroesMethod2(int[][] matrix) {
    	int row = matrix.length;
    	int column = matrix[0].length;
    	int[] rowMark = new int[row];
    	int[] columnMark = new int[column];
    	for(int i = 0; i < row; i++) {
    		for(int j = 0; j < column; j++) {
    			if(matrix[i][j] == 0) {
    				rowMark[i] = 1;
    				columnMark[j] = 1;
    			}
    		}
    	}
    	for(int i = 0; i < row; i++) {
    		if(rowMark[i] == 1) {
    			setRowZeroes(matrix, i);
    		}
    	}
    	for(int i = 0; i < column; i++) {
    		if(columnMark[i] == 1) {
    			setColumnZeroes(matrix, i);
    		}
    	}
    }
    
    //Method 3:
    //For more improvement, we use first row and first column in the 
    //matrix as marker to tell us whether some row or column contains
    //zero or zeroes. Once we find zero, for example, matrix[i][j] == 0
    //we set matrix[0][j] = 0 and matrix[i][0] = 0 so that we can know
    //which row and which column should set zero.
    //But this may cause a problem, which is we cannot determine whether
    //the first row and first column should be set zero. So we create 
    //two markers which only cost O(1) in space, to mark the first row 
    //and first column.
    //O(1) in space, O(mn) in time.   
    public static void setZeroesMethod3(int[][] matrix) {
    	int row = matrix.length;
    	int column = matrix[0].length;
    	boolean firstRow = false;
    	boolean firstColumn = false;
    	for(int i = 0; i < row; i++) {
    		for(int j = 0; j < column; j++) {
    			if(matrix[i][j] == 0) {
    				matrix[i][0] = 0;
    				matrix[0][j] = 0;
        			if(i == 0) {
        				firstRow = true;
        			}
        			if(j == 0) {
        				firstColumn = true;
        			}
    			}

    		}
    	}
    	for(int i = 1; i < row; i++) {
    		if(matrix[i][0] == 0) {
    			setRowZeroes(matrix, i);
    		}
    	}
    	for(int i = 1; i < column; i++) {
    		if(matrix[0][i] == 0) {
    			setColumnZeroes(matrix, i);
    		}
    	}
    	if(firstRow) {
    		setRowZeroes(matrix, 0);
    	}
    	if(firstColumn) {
    		setColumnZeroes(matrix, 0);
    	}
    }
        
    public static void setRowZeroes(int[][] matrix, int x) {
    	int column = matrix[0].length;
    	for(int i = 0; i < column; i++) {
    		matrix[x][i] = 0;
    	}
    }
    
    public static void setColumnZeroes(int[][] matrix, int y) {
    	int row = matrix.length;
    	for(int i = 0; i < row; i++) {
    		matrix[i][y] = 0;
    	}
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{0, 1}, {1, 1}};
		setZeroesMethod3(a);
	}

}
