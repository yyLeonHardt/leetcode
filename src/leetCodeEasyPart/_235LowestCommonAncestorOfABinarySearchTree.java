/*
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

 * According to the definition of LCA on Wikipedia: ¡°The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).¡±

 *         _______6______
 *        /              \
 *     ___2__          ___8__
 *    /      \        /      \
 *    0      _4       7       9
 *          /  \
 *          3   5
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
*/

package leetCodeEasyPart;

public class _235LowestCommonAncestorOfABinarySearchTree {
	
	// Method 1(Recursively):
	// O(h) in time where h is the height of the tree
	// O(h) in space where h is the height of the tree
	// 10ms - 2 - 47.57%
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return root;
        }        
        if(p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor1(root.right, p, q);
        }else if(p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor1(root.left, p, q);
        }else {
            return root;
        }
    }
	
    
    // Method 2(Iteratively):
    // O(h) in time where h is the height of the tree
    // O(1) in space
    // 10ms - 2 - 47.57%
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null) {
            if(p.val > root.val && q.val > root.val) {
                root = root.right;
            }else if(p.val < root.val && q.val < root.val) {
                root = root.left;
            }else {
                return root;
            }
        }
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
