/*Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?*/

package leetCodeMediumPart;

import java.util.Arrays;

public class _300LongestIncreasingSubsequence {
	
	//O(nlongn) in time
	public static int lengthOfLIS(int[] nums) {            
		int[] temp = new int[nums.length];
		int len = 0;
		int i;
		for(int n : nums) {
			i = Arrays.binarySearch(temp, 0, len, n);
			if(i < 0) {
				i = -(i + 1);
			}
			temp[i] = n;
			if(i == len) {
				len++;
			}
		}
		return len;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5, 10, 1, 2, 3};
		System.out.println(lengthOfLIS(a));
	}

}
