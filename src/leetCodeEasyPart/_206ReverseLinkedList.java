/*Reverse a singly linked list.*/

package leetCodeEasyPart;

public class _206ReverseLinkedList {
	
	
	// Method 1(Iteratively):
	// O(n) in time
	// O(1) in space
	// 0ms - 38.64%
    public ListNode reverseList1(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;
        while(cur != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            if(next != null) {
                next = next.next;                 
            }

        }
        return pre;
    }
    
    // Method 2(Recursively):
    // O(n) in time
    // O(1) in space
    // 1ms - 4.81%
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = reverseList2(next);
        next.next = head;
        return newHead;
    }
    
	public static void main(String[] args) {
		

	}

}
