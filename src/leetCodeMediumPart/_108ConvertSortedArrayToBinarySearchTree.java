/*Given an array where elements are sorted in ascending order, convert it to a height balanced BST.*/

package leetCodeMediumPart;

public class _108ConvertSortedArrayToBinarySearchTree {
	
    public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums == null) {
    		 return null;
    	}
        int len = nums.length;
        if(len == 0) {
        	return null;
        }
        return helpTool(nums, 0, len - 1);
    }
    
    public TreeNode helpTool(int[] nums, int begin, int end) {
    	if(end < begin) {
    		return null;
    	}
    	int mid = (begin + end) / 2;
    	TreeNode root = new TreeNode(nums[mid]);
    	root.left = helpTool(nums, begin, mid - 1);
    	root.right = helpTool(nums, mid + 1, end);
    	return root;
    }
    
	public static void main(String[] args) {


	}

}
