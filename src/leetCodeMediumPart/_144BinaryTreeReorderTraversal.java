/*Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?*/

package leetCodeMediumPart;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _144BinaryTreeReorderTraversal {
	
//Method 1(Recursive):
//	List<Integer> ret = new ArrayList<Integer>();
//	
//    public List<Integer> preorderTraversal(TreeNode root) {
//    	if(root == null)
//    		return ret;
//    	if(root.left == null && root.right == null) {
//    	    ret.add(root.val);
//    	    return ret;
//    	}
//    	helpTool(root);
//    	return ret;
//    }
//    
//    public void helpTool(TreeNode root) {
//        ret.add(root.val); 
//    	if(root.left != null)
//    		helpTool(root.left);
//    	if(root.right != null)
//    		helpTool(root.right);
//    }
	
//Method 2(Iterative):
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> ret = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	if(root == null)
    		return ret;
    	TreeNode temp = root;
    	stack.push(temp);
    	while(!stack.isEmpty()) {
    		temp = stack.pop();
    		ret.add(temp.val);
    		if(temp.right != null)
    			stack.push(temp.right);
    		else if(temp.left != null)
    			stack.push(temp.left);
    	}
    	return ret;
    }

	public static void main(String[] args) {


	}

}
