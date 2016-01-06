/*Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.*/

package leetCodeMediumPart;

public class _024SwapNodesInPairs {
	
    public ListNode swapPairs(ListNode head) {
    	if(head == null || head.next == null)
    		return head;
        ListNode temp = null;
        ListNode cur = head;
        ListNode pre = null;
        if(head.next != null)
        	head = head.next;
        while(cur != null && cur.next != null) {
        	temp = cur.next;
        	cur.next = cur.next.next;
        	temp.next = cur;
        	if(pre != null)
        		pre.next = temp;
        	pre = cur;
        	cur = cur.next;
        }
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
