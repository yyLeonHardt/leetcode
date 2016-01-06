/*
 * Invert a binary tree.

 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * to
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
*/

package leetCodeEasyPart;

public class _226InvertBinaryTree {
	
    public TreeNode invertTree(TreeNode root) {
    	
    	if(root == null)
    		return root;

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
