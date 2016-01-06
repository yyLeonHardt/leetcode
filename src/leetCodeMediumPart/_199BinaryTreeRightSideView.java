/*Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].*/

package leetCodeMediumPart;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class _199BinaryTreeRightSideView {
	
	
//    Original Method:	
//    public List<Integer> rightSideView(TreeNode root) {
//        Queue<TreeNode> que = new ArrayDeque<TreeNode>();
//        List<List<Integer>> lists = new ArrayList<List<Integer>>();
//        List<Integer> ret = new ArrayList<Integer>();
//        TreeNode temp = null;
//        if(root != null) {
//            que.offer(root);
//        }else {
//        	return ret;
//        }
//        while(!que.isEmpty()) {
//        	int size = que.size();
//        	List<Integer> tempList = new ArrayList<Integer>();
//        	for(int i = 0; i < size; i++) {
//        		temp = que.poll();
//        		tempList.add(temp.val);
//        		if(temp.left != null) {
//        			que.offer(temp.left);
//        		}
//        		if(temp.right != null) {
//        			que.offer(temp.right);
//        		}
//        	}
//        	lists.add(tempList);
//        }
//        for(int i = 0; i < lists.size(); i++) {
//        	ret.add(lists.get(i).get(lists.get(i).size() - 1));
//        }
//        return ret;
//    }

	
//  Improved Method:	
//    public List<Integer> rightSideView(TreeNode root) {
//        Queue<TreeNode> que = new ArrayDeque<TreeNode>();
//        List<Integer> ret = new ArrayList<Integer>();
//        TreeNode temp = null;
//        if(root != null) {
//            que.offer(root);
//        }else {
//        	return ret;
//        }
//        while(!que.isEmpty()) {
//        	int size = que.size();
//        	for(int i = 0; i < size; i++) {
//        		temp = que.poll();
//        		if(temp.left != null) {
//        			que.offer(temp.left);
//        		}
//        		if(temp.right != null) {
//        			que.offer(temp.right);
//        		}
//        		if(i == size - 1) {
//        			ret.add(temp.val);
//        		}
//        	}
//        }
//        return ret;
//    }
	
//  Recursive:
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> ret = new ArrayList<Integer>();
		if(root == null) {
			return ret;
		}
		return helpTool(root, ret, 0);
	}
	
	public List<Integer> helpTool(TreeNode root, List<Integer> ret, int height) {
		if(ret.size() == height) {
			ret.add(root.val);
		}
		if(root.left != null) {
			helpTool(root.left, ret, height + 1);
		}
		if(root.right != null) {
			helpTool(root.right, ret, height + 1);
		}
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
