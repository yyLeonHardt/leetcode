/*
 * Invert a binary tree.

 *       4
 *     /   \
 *    2     7
 *   / \   / \
 *  1   3 6   9
 *  to
 *       4
 *     /   \
 *    7     2
 *   / \   / \
 *  9   6 3   1
*/

package leetCodeEasyPart;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class _226InvertBinaryTree {
	
	// Recursively
	// DFS
	// O(n) in time where n is the number of node in tree
	// O(n) in space
    public TreeNode invertTreeDFS_R(TreeNode root) {
    	
    	if(root == null)
    		return root;

        TreeNode temp = root.left;
        root.left = invertTreeDFS_R(root.right);
        root.right = invertTreeDFS_R(temp);
        
        return root;
    }
    
    // Iteratively
    // BFS
    // O(n) in time where n is the number of node in the tree
    // O(m) in space where m is the max number of node in the same level of the tree
    public TreeNode invertTreeBFS_I(TreeNode root) {
        if(root == null) {
            return null;
        }
        Queue<TreeNode> que = new ArrayDeque<TreeNode>();
        que.offer(root);
        while(!que.isEmpty()) {
            int size = que.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                if(node.left != null) {
                    que.offer(node.left);
                }
                if(node.right != null) {
                    que.offer(node.right);
                }
            }
        }
        return root;
    }
    
    // Iteratively
    // DFS
    // O(n) in time where n is the number of node in the tree
    // Space complexity depends on the structure of the tree
    public TreeNode invertTreeDFS_I(TreeNode root) {
        if(root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if(node.left != null) {
                stack.push(node.left);
            }
            if(node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
