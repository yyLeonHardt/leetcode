/*Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 * For example, this binary tree is symmetric:

 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following is not:
 *     1
 *    / \
 *  2   2
¡¡£ª¡¡   \   \
¡¡£ª¡¡   3    3
¡¡£ª¡¡Note:
¡¡£ª¡¡Bonus points if you could solve it both recursively and iteratively.

¡¡£ª¡¡confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
*/

package leetCodeEasyPart;

import java.util.Stack;

public class _101SymmetricTree {
	
//Method 1:	
	public boolean isSymmetric(TreeNode root) {
        if(root == null)
        	return true;
        return isSymmetricHelp(root.left, root.right);		
    }
	
	public boolean isSymmetricHelp(TreeNode left, TreeNode right) {
		if(left == null && right == null)
			return true;
		if(left == null || right == null)
			return false;
		if(left.val != right.val)
			return false;
		return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}
	
//Method2:
	public boolean isSymmetric2(TreeNode root) {
		if(root == null)
			return true;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode left, right;
		if(root.left != null) {
			if(root.right == null)
				return false;
			stack.push(root.left);
			stack.push(root.right);
		}else if(root.right != null)
			return false;
		
		while(!stack.empty()) {
			if(stack.size() % 2 != 0)   
				return false;
			right = stack.pop();
			left = stack.pop();
			if(left.val != right.val)
				return false;
			if(left.left != null) {
				if(right.right == null)
					return false;
				stack.push(left.left);
				stack.push(right.right);
			}else if(right.right != null)
				return false;
			if(left.right != null) {
				if(right.left == null)
					return false;
				stack.push(left.right);
				stack.push(right.left);
			}else if(right.left != null)
				return false;
		}
		
		return true;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
