/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.*/

package leetCodeEasyPart;

public class _198HouseRobber {
	
	public int rob(int[] num) {
		
		int len = num.length;
		if(len == 0)
			return 0;
		if(len == 1)
			return num[0];
		if(len == 2)
			return Math.max(num[0], num[1]);
		int[] sum = new int[len];
		for(int i = 0; i < len; i++)
		    sum[i] = 0;
		sum[0] = num[0];
		sum[1] = Math.max(num[0], num[1]);
		for(int i = 2; i < len; i++) {
			sum[i] = Math.max(sum[i], Math.max(sum[i - 1], sum[i - 2] + num[i]));
		}
		
		return sum[len - 1];
        
    }
	

	public static void main(String[] args) {
		

	}

}
