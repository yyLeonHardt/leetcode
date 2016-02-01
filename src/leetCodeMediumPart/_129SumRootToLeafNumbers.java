/*Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.*/

package leetCodeMediumPart;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class _129SumRootToLeafNumbers {
	
	//DFS(Recursively)
	//O(n) in time
    public int sumNumbersRecursively(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
        List<Integer> nums = new ArrayList<Integer>();
        rootToLeafNums(root, nums, 0);
        int sum = 0;
        for(int num : nums) {
        	sum += num;
        }
        return sum;
    }
    
    public void rootToLeafNums(TreeNode root, List<Integer> list, int num) {
    	num = root.val + num * 10;
    	if(root.left == null && root.right == null) {
    		list.add(num);
    		return;
    	}
    	if(root.left != null) {
    		rootToLeafNums(root.left, list, num);
    	}
    	if(root.right != null) {
    		rootToLeafNums(root.right, list, num);
    	}
    }
    
    //BFS(Iteratively)
    public int sumNumberIteratively(TreeNode root) {
    	List<Integer> nums = new ArrayList<Integer>();
    	Queue<TreeNode> nodeQue = new ArrayDeque<TreeNode>();
    	Queue<Integer> numQue = new ArrayDeque<Integer>();
    	TreeNode tempNode;
    	int tempNum;
    	if(root == null) {
    		return 0;
    	}
    	nodeQue.offer(root);
    	numQue.offer(root.val);
    	while(!nodeQue.isEmpty()) {
    		int size = nodeQue.size();
    		for(int i = 0; i < size; i++) {
    			tempNode = nodeQue.poll();
    			tempNum = numQue.poll();
    			if(tempNode.left != null) {
    				nodeQue.offer(tempNode.left);
    				numQue.offer(tempNum * 10 + tempNode.left.val);
    			}
    			if(tempNode.right != null) {
    				nodeQue.offer(tempNode.right);
    				numQue.offer(tempNum * 10 + tempNode.right.val);
    			}
    			if(tempNode.left == null && tempNode.right == null) {
    				nums.add(tempNum);
    			}
    		}
    	}
    	int sum = 0;
    	for(int num : nums) {
    		sum += num;
    	}
    	return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
