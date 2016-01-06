/*Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.*/

package leetCodeEasyPart;

public class _019RemoveNthNodeFromEndOfList {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		
//Method 1(count length of the list, and then move head to position of length - n, and delete the target node.)
//        int len = 1;
//        ListNode temp = head;
//        while(temp.next != null) {
//        	temp = temp.next;
//        	len++;
//        }
//        if(len == 1 && n == 1)
//        	return null;
//        if(len == n)
//        	return head.next;
//        temp = head;
//        for(int i = 1; i < (len - n); i++) {
//        	temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        return head;

//Method 2(create two head which distance is n, and then move then to next node at the same time, finally we wil find the nth node from the end, and delete the target node):
		if(head == null)
			return null;
			
		if(head.next == null && n == 1)
		    return null;
		ListNode fast = head;
		ListNode slow = head;
		while(n-- > 0)
			fast = fast.next;
		if(fast == null)
			return head.next;
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
    }
	
	public static void main(String[] args) {
		

	}

}
