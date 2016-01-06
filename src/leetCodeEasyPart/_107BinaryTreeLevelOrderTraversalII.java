/*Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *    /  \
 *    15   7
 *return its bottom-up level order traversal as: 
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 * */

package leetCodeEasyPart;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class _107BinaryTreeLevelOrderTraversalII {
	
	List<List<Integer>> ret = new ArrayList<List<Integer>>();


	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		
//Method 1(BFS):		
//		List<List<Integer>> output = new ArrayList<List<Integer>>();
//		if(root == null)
//			return output;
//		TreeNode nodeTemp = null;
//		Queue<TreeNode> queue1 = new ArrayDeque<TreeNode>();
//		Queue<TreeNode> queue2 = new ArrayDeque<TreeNode>();
//		queue1.offer(root);
//		while(!queue1.isEmpty() || !queue2.isEmpty()) {
//			List<Integer> listTemp = new ArrayList<Integer>();
//			if(!queue1.isEmpty() && queue2.isEmpty()) {
//				while(!queue1.isEmpty()) {
//					nodeTemp = queue1.poll();
//					listTemp.add(nodeTemp.val);
//					if(nodeTemp.left != null)
//						queue2.offer(nodeTemp.left);
//					if(nodeTemp.right != null)
//						queue2.offer(nodeTemp.right);
//				}
//			}else if(queue1.isEmpty() && !queue2.isEmpty()) {
//				while(!queue2.isEmpty()) {
//					nodeTemp = queue2.poll();
//					listTemp.add(nodeTemp.val);
//					if(nodeTemp.left != null)
//						queue1.offer(nodeTemp.left);
//					if(nodeTemp.right != null)
//						queue1.offer(nodeTemp.right);
//				}
//			}
//
//			output.add(0, listTemp);
//		}		
//		return output;
		
//Method 2(DFS):
		if(root == null)
			return ret;
		helpTool(root, 0);
		for(int i = 0; i < ret.size(); i++)
			ret.add(0, ret.remove(i));
		
		return ret;
    }
	
	public void helpTool(TreeNode root, int level) {
		if(root == null)
			return;
		if(ret.size() == level)
			ret.add(new ArrayList<Integer>());
		ret.get(level).add(root.val);
		helpTool(root.left, level + 1);
		helpTool(root.right, level + 1);
	}



	public void main(String[] args) {


	}

}
