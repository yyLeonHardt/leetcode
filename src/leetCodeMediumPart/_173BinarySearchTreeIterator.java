/*mplement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.*/

package leetCodeMediumPart;

import java.util.Stack;

public class _173BinarySearchTreeIterator {
	
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */

	public class BSTIterator {
		
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	
    	//To initialize it iterator, store each left node from the root 
    	//to bottom, where the leaf is in the top of the stack and root
    	//is on the bottom.
	    public BSTIterator(TreeNode root) {
	    	if(root == null) {
	    		return;
	    	}
	    	TreeNode temp;
	    	stack.push(root);
	    	temp = stack.peek();
	    	while(temp.left != null) {
	    		stack.push(temp.left);
		    	temp = stack.peek();
	    	}
	    }

	    /** @return whether we have a next smallest number */
	    //if the stack is empty, then there is no next node, otherwise
	    //there should have node for next.
	    public boolean hasNext() {
	        return !stack.isEmpty();
	    }

	    /** @return the next smallest number */
	    //Each time return the top node value of stack, and check whether 
	    //top node has right node, if it dose, then check if the right node
	    //has left node and put them into stack with the order that value of
	    //nodes become smaller from bottom to top.
	    public int next() {
	    	TreeNode ret = stack.pop();
	    	TreeNode temp;
	    	if(ret.right != null) {
	    		stack.push(ret.right);
	    		temp = stack.peek();
		    	while(temp.left != null) {
		    		stack.push(temp.left);
		    		temp = stack.peek();
		    	}
	    	}
	    	return ret.val;
	    }
	}

	/**
	 * Your BSTIterator will be called like this:
	 * BSTIterator i = new BSTIterator(root);
	 * while (i.hasNext()) v[f()] = i.next();
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
