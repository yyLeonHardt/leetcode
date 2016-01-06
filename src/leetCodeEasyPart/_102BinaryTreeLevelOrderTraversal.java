/*Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]*/

package leetCodeEasyPart;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class _102BinaryTreeLevelOrderTraversal {

	
//Method 1(BFS):
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> ret = new ArrayList<List<Integer>>();
//        TreeNode nodeTemp = null;
//        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
//        if(root == null)
//        	return ret;
//        queue.offer(root);
//        int size = 0;
//        while(!queue.isEmpty()) {
//            List<Integer> listTemp = new ArrayList<Integer>();
//        	size = queue.size();
//        	for(int i = 0; i < size; i++) {
//        		nodeTemp = queue.remove();
//        		listTemp.add(nodeTemp.val);
//        		if(nodeTemp.left != null)
//        			queue.offer(nodeTemp.left);
//        		if(nodeTemp.right != null)
//        			queue.offer(nodeTemp.right);
//        	}
//        	ret.add(listTemp);
//        }
//        return ret;
//    }
	
//Method 2(BFS):
	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
    	if(root == null)
    		return ret;
    	helpTool(root, 0);
    	return ret;
    }
    
    public void helpTool(TreeNode root, int level) {
    	if(root == null)
    		return;
    	if(level == ret.size())
    		ret.add(new ArrayList<Integer>());
    	ret.get(level).add(root.val);
    	helpTool(root.left, level + 1);
    	helpTool(root.right, level + 1);
    }

	public static void main(String[] args) {


	}

}
