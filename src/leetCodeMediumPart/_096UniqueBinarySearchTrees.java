/*Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3*/

package leetCodeMediumPart;

public class _096UniqueBinarySearchTrees {
	
    public static int numTrees(int n) {
    	if(n == 1)
    		return 1;
    	if(n == 2)
    		return 2;
    	int[] temp = new int[n + 1];
    	temp[1] = 1;
    	temp[2] = 2;
    	int left = 0;
    	int right = 0;
    	int cnt = 0;
    	for(int j = 3; j <= n; j++) {
        	cnt = 0;
            for(int i = 1; i <= j; i++) {
            	left = i - 1;
            	right = j - i;
           		if(left <= 1)
           			left = 1;
           		if(right <= 1)
           			right = 1;
           		cnt += temp[left] * temp[right];
        	}
            temp[j] = cnt;
    	}

        return temp[n];
    }

	public static void main(String[] args) {
		System.out.println(numTrees(3));
	}

}
