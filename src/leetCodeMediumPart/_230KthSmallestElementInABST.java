/*Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ¡Ü k ¡Ü BST's total elements.*/

package leetCodeMediumPart;

public class _230KthSmallestElementInABST {
	
    public int kthSmallest(TreeNode root, int k) {
        int nodeNum = subTreeNodeNum(root.left) + 1;
        int ret = 0;
        if(nodeNum == k) {
        	return root.val;
        }else if(nodeNum > k) {
        	ret = kthSmallest(root.left, k);
        }else {
        	ret = kthSmallest(root.right, k - nodeNum);
        }
        return ret;
    }
    
    public int subTreeNodeNum(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	return 1 + subTreeNodeNum(root.left) + subTreeNodeNum(root.right);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
