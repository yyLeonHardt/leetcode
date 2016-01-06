/*Reverse a singly linked list.*/

package leetCodeEasyPart;

public class _z206ReverseLinkedList {
	
    public ListNode reverseList(ListNode head) {
    	
//Method 1:    	
//    	if(head == null || head.next == null)
//    		return head;
//    	
//    	ListNode pre = null;
//    	ListNode cur = head;
//
//    	while(cur != null) {
//        	ListNode next = cur.next;
//        	cur.next = pre;
//        	pre = cur;
//        	cur = next;
//    	}
//    	
//    	return pre;
    	
//Method 2:
    	if(head == null || head.next == null)
    		return head;
    	ListNode next = head.next;
    	head.next = null;
    	ListNode newHead = reverseList(next);
    	next.next = head;
    	return newHead;
    }

	public static void main(String[] args) {
		

	}

}
