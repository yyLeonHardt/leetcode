/*A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?*/

package leetCodeMediumPart;

public class _062UniquePaths {
	
//    public int uniquePaths(int m, int n) {
//    	if(m < 1 || n < 1) {
//    		return 0;
//    	}
//        if(m == 1 && n == 1) {
//        	return 1;
//        }else if(m > 1 && n == 1) {
//        	return uniquePaths(m - 1, n);
//        }else if(m == 1 && n > 1) {
//        	return uniquePaths(m, n - 1);
//        }else {
//        	return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
//        }
//    }
	
//	public int uniquePaths(int m, int n) {
//		int[][] temp = new int[m][n];
//		for(int i = 0; i < m; i++) {
//			for(int j = 0; j < n; j++) {
//				if(i == 0 || j == 0) {
//					temp[i][j] = 1;
//				}else {
//					temp[i][j] = temp[i - 1][j] + temp[i][j - 1];
//				}
//			}
//		}
//		return temp[m - 1][n - 1];
//	}
	
	public int uniquePaths(int m, int n) {
		int total = m + n - 2;
		int goDownSteps = n - 1;
		double ret = 1;
		for(int i = 1; i <= goDownSteps; i++) {
			ret = ret * (total - goDownSteps + i) / i;
		}
		return (int)ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
