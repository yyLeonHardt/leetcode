/*
 * Given a binary tree, find its maximum depth.

 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/

package leetCodeEasyPart;

import java.util.ArrayDeque;
import java.util.Queue;

public class _104MaximumDepthOfBinaryTree {
	
	// BFS
	// Recursively
	// O(n) in time where n is the number of tree node
	// O(h) in space where h is the height of the tree
	public int maxDepthBFS_R(TreeNode root) {
		
		if(root == null)
			return 0;
        
        return Math.max(maxDepthBFS_R(root.left), maxDepthBFS_R(root.right)) + 1;
    }
	
    // DFS
    // Recursively
	// O(n) in time where n is the number of tree node
	// O(h) in space where h is the number of tree
    int ret = 0;
    public int maxDepthDFS_R(TreeNode root) {
        depth(root, 0);
        return ret;
    }
    
    public void depth(TreeNode root, int dep) {
        if(root == null) {
            if(dep > ret) {
                ret = dep;
            }
            return;
        }
        depth(root.left, dep + 1);
        depth(root.right, dep + 1);
    }
    
    // Iteratively
    // BFS
    // O(n) in time where n is the number of tree node
    // O(m) in space where m is the max number of the tree in one same level
    public int maxDepthBFS_I(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> que = new ArrayDeque<TreeNode>();
        que.offer(root);
        int depth = 0;
        while(!que.isEmpty()) {
            int size = que.size();
            for(int i = 0; i < size; i++) {
                TreeNode temp = que.poll();
                if(temp.left != null) {
                    que.offer(temp.left);
                }
                if(temp.right != null) {
                    que.offer(temp.right);
                }
            }
            depth++;
        }
        return depth;
    }


	public static void main(String[] args) {

	}

}
