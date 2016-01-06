/*Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5*/

package leetCodeEasyPart;

public class _203RemoveLinkedListElements {
	
    public ListNode removeElements(ListNode head, int val) {
//Method 1:       
//    	ListNode fast = head;
//    	ListNode slow = head;
//    	if(head == null)
//    		return null;
//    	while(head.val == val) {
//    		if(head.next == null) {
//    			head = null;
//    			return head;
//    		}else
//    			head = head.next;
//    	}
//    	while(fast.next != null) {
//    		fast = fast.next;
//    		if(fast.val != val)
//    			slow = slow.next;
//    		else {
//    			while(fast.next != null && fast.next.val == val) {
//    				fast = fast.next;
//    			}
//    			if(fast.next == null) {
//    				slow.next = null;
//    			}else{
//        			slow.next = fast.next;
//        			fast = fast.next;
//        			slow = slow.next;
//    			}
//    		}
//    	}
//    	return head;
    	
//Method 2:
    	ListNode temp = head;
    	if(head == null)
    		return head;
    	while(head.val == val) {
    		if(head.next == null)
    			return null;
    		else
    			head = head.next;
    	}
    	
    	while(temp.next != null) {
    		if(temp.next.val == val) {
    			temp.next = temp.next.next;
    		}else
    			temp = temp.next;
    	}
    	return head;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
