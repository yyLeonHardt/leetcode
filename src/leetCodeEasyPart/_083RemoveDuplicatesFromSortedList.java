/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
*/

package leetCodeEasyPart;

public class _083RemoveDuplicatesFromSortedList {
	
    public ListNode deleteDuplicates(ListNode head) {

//Method 1:
//    	ListNode temp = head;
//    	while(temp != null) {
//    		if(temp.next == null)
//    			return head;
//    		if(temp.next.val == temp.val)
//    			temp.next = temp.next.next;
//    		else
//    			temp = temp.next;
//    	}
//    	
//    	
//    	return head;
    
//Method 2:
    	if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }

	public static void main(String[] args) {
		

	}

}
