/*Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.*/

package leetCodeMediumPart;

import java.util.ArrayList;
import java.util.List;

public class _279PerfectSquares {
	
	
	//O(n2) in time
    public int numSquaresMethod1(int n) {
    	int[] ret = new int[n + 1];
    	for(int i = 1; i * i <= n; i++) {
    		ret[i * i] = 1;
    	}
    	for(int i = 2; i <= n; i++) {
    		if(ret[i] != 0) {
    			continue;
    		}
    		ret[i] = lowestCount(ret, i);
    	}
    	return ret[n];
    }
    
    public int lowestCount(int[] cntTemp, int target) {
    	int lowestCnt = Integer.MAX_VALUE;
    	int cnt = 0;
    	for(int i = 1; i < target; i++) {
    		cnt = cntTemp[i] + cntTemp[target - i];
    		if(cnt < lowestCnt) {
    			lowestCnt = cnt;
    		}
    	}
    	return lowestCnt;
    }
    
    //DP
    public int numSquaresMethod2(int n) {
    	int sqrt;
    	int[] dp = new int[n + 1];
    	for(int i = 1; i <= n; i++) {
    		dp[i] = Integer.MAX_VALUE;
    	}
    	for(int i = 1; i <= n; i++) {
    		sqrt = (int) Math.sqrt(i);
    		if(sqrt * sqrt == i) {
    			dp[i] = 1;
    			continue;
    		}
    		for(int j = 1; j <= sqrt; j++) {
    			int diff = i - j * j;
    			dp[i] = Math.min(dp[i], dp[diff] + 1);
    		}
    	}
    	return dp[n];
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
