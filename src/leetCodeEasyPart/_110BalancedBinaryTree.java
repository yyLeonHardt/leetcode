/*Given a binary tree, determine if it is height-balanced.

 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
*/

package leetCodeEasyPart;

public class _110BalancedBinaryTree {
	
	public int treeHeight(TreeNode root, int height) {
		
		if(root == null)
			return height + 1;
		int leftHeight = treeHeight(root.left, height + 1);
		int rightHeight = treeHeight(root.right, height + 1);
		if(Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		
		return Math.max(leftHeight, rightHeight);
		
	}

//Method 2:	
//	public int treeHeight2(TreeNode root) {
//		
//		if(root == null)
//			return 0;
//		int leftHeight = treeHeight2(root.left) + 1;
//		int rightHeight = treeHeight2(root.right) + 1;
//		if(Math.abs(leftHeight - rightHeight) > 1)
//			return -10000;
//		return Math.max(leftHeight, rightHeight) + 1;
//	}
	
	public boolean isBalanced(TreeNode root) {
		
		if(root == null)
			return true;
		
		return treeHeight(root, 0) > 0;
        
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
