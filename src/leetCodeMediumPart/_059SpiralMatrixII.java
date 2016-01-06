/*Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]*/

package leetCodeMediumPart;

public class _059SpiralMatrixII {
	
	public static int[][] generateMatrix(int n) {
        int[][] ret = new int[n][n];
		int max = n * n;
		int row = 0;
		int col = 0;
		for(int i = 1; i <= max;) {
			while(row >= 0 && row < n && col >= 0 && col < n && ret[row][col] == 0) {
				ret[row][col] = i;
				i++;
				col++;
			}
			col--;
			row++;
			while(row >= 0 && row < n && col >= 0 && col < n && ret[row][col] == 0) {
				ret[row][col] = i;
				i++;			
				row++;
			}
			row--;
			col--;
			while(row >= 0 && row < n && col >= 0 && col < n && ret[row][col] == 0) {
				ret[row][col] = i;
				i++;
				col--;
			}
			col++;
			row--;
			while(row >= 0 && row < n && col >= 0 && col < n && ret[row][col] == 0) {
				ret[row][col] = i;
				i++;
				row--;
			}
			row++;
			col++;
		}
		
		return ret;
    }

	public static void main(String[] args) {
		int n = 4;
		int[][] ret = generateMatrix(n);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(ret[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
