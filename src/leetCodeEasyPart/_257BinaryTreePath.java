/*
 * Given a binary tree, return all root-to-leaf paths.

 * For example, given the following binary tree:

 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 * All root-to-leaf paths are:
 *
 * ["1->2->5", "1->3"]
 */

//DFS

package leetCodeEasyPart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class _257BinaryTreePath {
	
	public List<String> binaryTreePaths(TreeNode root) {
        
		List<String> output = new ArrayList<String>();
		String s = "";
        if(root != null) {
        	binaryTreePath(root, output, s);
        }
		
		return output;
    }
	
	public void binaryTreePath(TreeNode root, List<String> output, String s) {
		
		if(s.isEmpty()) {
			s += root.val;
		}else {
			s += "->" + root.val;
		}

		if(root.left != null)
			binaryTreePath(root.left, output, s);
		if(root.right != null)
			binaryTreePath(root.right, output, s);
		if(root.left == null && root.right == null)
			output.add(s);
		

	}

	public static void main(String[] args) {
		
		_257BinaryTreePath z = new _257BinaryTreePath();
		
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		
		root.left = node2;
		root.right = node3;
		root.left.right =node5;
		
		List<String> output = z.binaryTreePaths(root);
		Iterator<String> i = output.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
