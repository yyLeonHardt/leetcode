/*
 * Given two binary trees, write a function to check if they are equal or not.

 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
*/

package leetCodeEasyPart;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class _100SameTree {
	
	// Recursively
	// DFS
	// O(n) in time where n is the number of node in tree
	// O(h) in space where h is the height of the tree
    public boolean isSameTreeDFS_R(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }else if(p != null && q != null) {
            if(p.val != q.val) {
                return false;
            }else {
                return (isSameTreeDFS_R(p.left, q.left) && isSameTreeDFS_R(p.right, q.right));
            }
        }
        return false;
    }
    
    // Iteratively
    // BFS
    // O(n) in time
    // O(m) in space where m is the max number at the same level in the tree.
    public boolean isSameTreeBFS_I(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }else if((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        Queue<TreeNode> queP = new ArrayDeque<TreeNode>();
        Queue<TreeNode> queQ = new ArrayDeque<TreeNode>();
        queP.offer(p);
        queQ.offer(q);
        while(!queP.isEmpty()) {
            int size = queP.size();
            for(int i = 0; i < size; i++) {
                TreeNode tempP = queP.poll();
                TreeNode tempQ = queQ.poll();
                if(tempP.val != tempQ.val) {
                    return false;
                }
                if((tempP.left == null && tempQ.left != null) || (tempP.left != null && tempQ.left == null)) {
                    return false;
                }
                if(tempP.left != null) {
                    queP.offer(tempP.left);
                    queQ.offer(tempQ.left);
                }
                if((tempP.right == null && tempQ.right != null) || (tempP.right != null && tempQ.right == null)) {
                    return false;
                }
                if(tempP.right != null) {
                    queP.offer(tempP.right);
                    queQ.offer(tempQ.right);
                }
            }

        }
        return true;
    }
    
    // Iteratively
    // DFS
    // O(n) in time
    // O(h) in space
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }else if((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        Stack<TreeNode> stackP = new Stack<TreeNode>();
        Stack<TreeNode> stackQ = new Stack<TreeNode>();
        stackP.push(p);
        stackQ.push(q);
        while(!stackP.isEmpty()) {
            TreeNode tempP = stackP.pop();
            TreeNode tempQ = stackQ.pop();
            if(tempP.val != tempQ.val) {
                return false;
            }
            if((tempP.right == null && tempQ.right != null) || (tempP.right != null && tempQ.right == null)) {
                return false;
            }
            if(tempP.right != null) {
                stackP.push(tempP.right);
                stackQ.push(tempQ.right);
            }
            if((tempP.left == null && tempQ.left != null) || (tempP.left != null && tempQ.left == null)) {
                return false;
            }
            if(tempP.left != null) {
                stackP.push(tempP.left);
                stackQ.push(tempQ.left);
            }            
            
        }
        return true;
    }

	public static void main(String[] args) {

	}

}
