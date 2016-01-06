/*Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.*/

package leetCodeMediumPart;

import java.util.Queue;

public class _064MinimumPathSum {
	
    //Recursive:(Time Limit Exceeded)
	/*
    public int minPathSum(int[][] grid) {
    	int row = grid.length;
    	int col = grid[0].length;
    	if(grid == null || row == 0 || col == 0) {
    		return 0;
    	}
        return helpTool(grid, row - 1, col - 1);
    }
    
    public int helpTool(int[][] grid, int row, int col) {
    	if(row == 0 && col == 0) {
    		return grid[row][col];
    	}
    	if(row == 0) {
    		return helpTool(grid, row, col - 1) + grid[row][col];
    	}
    	if(col == 0) {
    		return helpTool(grid, row - 1, col) + grid[row][col];
    	}
    	return Math.min(helpTool(grid, row - 1, col), helpTool(grid, row, col - 1)) + grid[row][col];
    }
    */
	
	//Iterative:
	public int minPathSum(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		if(grid == null || row == 0 || col == 0) {
			 return 0;
		}
		int[][] ret = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(i == 0 && j == 0) {
					ret[i][j] = grid[i][j];
				}else if(i == 0) {
					ret[i][j] = ret[i][j - 1] + grid[i][j];
				}else if(j == 0) {
					ret[i][j] = ret[i - 1][j] + grid[i][j];
				}else {
					ret[i][j] = Math.min(ret[i - 1][j], ret[i][j - 1]) + grid[i][j];
				}
			}
		}
		return ret[row - 1][col - 1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
