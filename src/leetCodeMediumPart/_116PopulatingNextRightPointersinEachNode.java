/*Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
For example,
Given the following perfect binary tree,
         1
       /  \
      2    3
     / \  / \
    4  5  6  7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL*/

package leetCodeMediumPart;

public class _116PopulatingNextRightPointersinEachNode {

	
//Method 1(recursive):	
//    public void connect(TreeLinkNode root) {
//    	if(root == null || (root.left == null && root.right == null))
//    		return;
//    	helpTool(root);
//    	helpTool2(root);    	
//    }
//    public void helpTool(TreeLinkNode root) {
//    	if(root.left != null && root.right != null) {
//    		root.left.next = root.right;
//    		helpTool(root.left);
//    		helpTool(root.right);
//    	}    	
//    }
//    
//    public void helpTool2(TreeLinkNode root) {
//    	if(root.left != null && root.right != null) {
//        	if(root.next != null) {
//        		root.right.next = root.next.left;
//        	}
//        	helpTool2(root.left);
//        	helpTool2(root.right);
//    	}
//
//    }
	
//Method 2:
    public void connect(TreeLinkNode root) {
        TreeLinkNode level_start=root;
        while(level_start!=null){
            TreeLinkNode cur=level_start;
            while(cur!=null){
                if(cur.left!=null) cur.left.next=cur.right;
                if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;

                cur=cur.next;
            }
            level_start=level_start.left;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
