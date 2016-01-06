package leetCodeEasyPart;

public class _112PathSum {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	 public boolean hasPathSum(TreeNode root, int sum) {
		 
		 if(root == null){
			 return false;
		 }
		 
		 TreeNode current = root;
		 int remainder = sum - current.val;
		 if(current.left == null && current.right == null && remainder == 0){
			 return true;
		 }
		 if(remainder != 0 && current.left != null){
			 return hasPathSum(current.left, remainder);
		 }
		 if(remainder != 0 && current.right != null){
			 return hasPathSum(current.right, remainder);
		 }
	      
		 return false;
	 }

	public static void main(String[] args) {
		

	}

}
