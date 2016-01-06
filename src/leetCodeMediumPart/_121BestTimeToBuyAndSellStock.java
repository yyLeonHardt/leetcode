/*Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.*/

package leetCodeMediumPart;

public class _121BestTimeToBuyAndSellStock {

//Method 1:
//	public static int maxSubArray(int[] prices, int left, int right) {
//		int mid = (left + right) / 2;
//		if(left < right) {
//			int leftMax = maxSubArray(prices, left, mid);
//			int rightMax = maxSubArray(prices, mid + 1, right);
//			int crossMax = maxCrossArray(prices, left, right);
//			return Math.max(crossMax, Math.max(leftMax, rightMax));
//		}else
//			return prices[left];
//	}
//	
//	public static int maxCrossArray(int[] prices, int left, int right) {
//		if(left < right) {
//			int mid = (left + right) / 2;
//			int sum = 0;
//			int leftMax = Integer.MIN_VALUE;
//			int rightMax = Integer.MIN_VALUE;
//			for(int i = mid; i > left - 1; i--) {
//				sum += prices[i];
//				if(sum > leftMax)
//					leftMax = sum;
//			}
//			sum = 0;
//			for(int i = mid + 1; i < right + 1; i++) {
//				sum += prices[i];
//				if(sum > rightMax)
//					rightMax = sum;
//			}
//			return Math.max(leftMax + rightMax, Math.max(leftMax, rightMax));
//		}else
//			return prices[left];
//	}
//	
//    public static int maxProfit(int[] prices) {
//    	if(prices.length == 0 || prices == null)
//    		return 0;
//    	if(prices.length == 1)
//    		return 0;
//        int[] diff = new int[prices.length - 1];
//        for(int i = 0; i < diff.length; i++)
//        	diff[i] = prices[i + 1] - prices[i];
//        int ret = maxSubArray(diff, 0, diff.length - 1);
//        if(ret < 0)
//        	ret = 0;
//        return ret;
//    }
	
//Method 2:
    public static int maxProfit(int[] prices) {
    	if(prices.length == 0 || prices == null)
    		return 0;
    	int min = prices[0];
    	int max = 0;
    	for(int i = 1; i < prices.length; i++) {
    		max = Math.max(max, prices[i] - min);
    		min = Math.min(min, prices[i]);
    	}
    	return max;
    }

	public static void main(String[] args) {
		int[] a = {3,2,6,5,0,3};
		System.out.println(maxProfit(a));
	}

}
