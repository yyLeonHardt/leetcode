/*Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.*/

package leetCodeEasyPart;

import java.util.ArrayDeque;
import java.util.Queue;

public class _111MinimumDepthofBinaryTree {

	
//Method 1(DFS):	
//	int minLevel = 0;
//	
//    public int minDepth(TreeNode root) {
//        if(root == null)
//        	return 0;
//        if(root.left == null && root.right == null)
//        	return 1;
//        helpTool(root, 1);
//        return minLevel;
//    }
//    
//    public void helpTool(TreeNode root, int level) {
//    	if(root == null)
//    		return;
//    	if(root.left == null && root.right == null) {
//    		if(minLevel == 0)
//    			minLevel = level;
//    		else if(level < minLevel)
//    			minLevel = level;
//    	}
//    	helpTool(root.left, level + 1);
//    	helpTool(root.right, level + 1);
//    }
	

	public int minDepth(TreeNode root) {
//Method 2(BFS):
//		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
//		TreeNode temp = null;
//		if(root == null)
//			return 0;
//		int level = 1;
//		queue.offer(root);
//		int size = 0;
//		while(!queue.isEmpty()) {
//			size = queue.size();
//			for(int i = 0; i < size; i++) {
//				temp = queue.remove();
//				if(temp.left == null && temp.right == null)
//					return level;
//				if(temp.left != null)
//					queue.offer(temp.left);
//				if(temp.right != null)
//					queue.offer(temp.right);
//			}
//			level++;
//		}
//		return level;
		
//Method 3:
		if(root == null)
			return 0;
		
		if(root.left != null && root.right == null)
			return 1 + minDepth(root.left);
		if(root.left == null && root.right != null)
			return 1 + minDepth(root.right);

		return 1 + Math.min(minDepth(root.left), minDepth(root.right));

	}

	public static void main(String[] args) {
		

	}

}
