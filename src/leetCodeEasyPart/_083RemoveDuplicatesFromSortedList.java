/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
*/

package leetCodeEasyPart;

public class _083RemoveDuplicatesFromSortedList {
	
	// Method 1:
	// Recursively
	// O(n) in time
	// O(n) in space
	// 1ms - 1 - 25.39%
    public ListNode deleteDuplicates1(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        while(head.val == head.next.val) {
            head = head.next;
            if(head.next == null) {
                return head;
            }
        }
        head.next = deleteDuplicates1(head.next);
        return head;
    }
    
    // Method 2:
    // Iteratively
    // O(n) in time
    // O(1) in space
	// 1ms - 1 - 25.39%
    public ListNode deleteDuplicates2(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            if(cur.next == null) {
                return head;
            }
            if(cur.next.val == cur.val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;        
    }

	public static void main(String[] args) {
		

	}

}
