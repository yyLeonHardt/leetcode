/*Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?*/

package leetCodeMediumPart;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _094BinaryTreeInorderTraversal {
	
//Method 1(Recursive):
//	List<Integer> ret = new ArrayList<Integer>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        if(root == null)
//        	return ret;
//        helpTool(root);
//        return ret;
//    }
//    
//    public void helpTool(TreeNode root) {
//    	if(root.left != null)
//    		helpTool(root.left);
//    	ret.add(root.val);
//    	if(root.right != null)
//    		helpTool(root.right);
//    }
	
//Method 2(Iterative):
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ret = new ArrayList<Integer>();
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        TreeNode temp = root;
//        if(root == null)
//        	return ret;
//        stack.push(temp);
//        while(!stack.isEmpty()) {
//        	if(stack.peek().left != null) {
//        		temp = stack.peek();
//        		stack.push(temp.left);
//        		temp.left = null;
//        	}else {
//        		temp = stack.pop();
//        		ret.add(temp.val);
//        		if(temp.right != null)
//        			stack.push(temp.right);
//        	}
//        }
//        return ret;
//    }
	
//Method 3(Marris):
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ret = new ArrayList<Integer>();
		TreeNode cur = root;
		while(cur != null) {
			if(cur.left == null) {
				ret.add(cur.val);
				cur = cur.right;
			}else {
				TreeNode temp = cur.left;
				while(temp.right != null && temp.right != cur)
					temp = temp.right;
				if(temp.right == cur) {
					ret.add(cur.val);
					cur = cur.right;
					temp.right = null;					
				}else {
					temp.right = cur;
					cur = cur.left;
				}
			}
		}
		return ret;
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
