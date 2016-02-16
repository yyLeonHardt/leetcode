/*Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6*/

package leetCodeMediumPart;

public class __114FlattenBinaryTreeToLinkedList {
	
    public void flatten(TreeNode root) {
    	if(root == null || (root.left == null && root.right == null)) {
    		return;
    	}
    	if(root.left != null) {
    		flat(root.left, root);
    	}else {
    		flatten(root.right);
    	}
    }
    
    public void flat(TreeNode root, TreeNode parent) {
    	if(root.left != null) {
    		flat(root.left, root);
    	}
    	TreeNode right = parent.right;
    	TreeNode left = root.left;
    	while(left.right != null) {
    		left = left.right;
    	}
    	root.right = root.left;
    	root.left = null;
    	left.right = right;
    	flatten(right);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
