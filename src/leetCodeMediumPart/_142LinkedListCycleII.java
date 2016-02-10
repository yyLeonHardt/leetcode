/*Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?*/

package leetCodeMediumPart;

public class _142LinkedListCycleII {
	
	//Firstly, use a fast pointer and a slow pointer to determine whether 
	//there is a loop.
	//If it does not, return null.
	//If it does, then calculate the length n of the loop
	//Finally, beginning from the head of the linked list, and set fast 
	//pointer n node ahead of the slow pointer. Then move them together,
	//if they go to the same node, then that is the beginning of cycle.
	//O(n) in time.
    public ListNode detectCycle(ListNode head) {
    	if(head == null || head.next == null) {
    		return null;
    	}
    	ListNode slow = head;
    	ListNode fast = head;
    	while(fast != null && fast.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		if(fast == null || fast.next == null) {
    			return null;
    		}
    		if(fast == slow) {
    			break;
    		}
    	}
    	ListNode temp = slow;
    	int loopLen = 0;
    	do {
    		slow = slow.next;
    		loopLen++;
    	} while(slow != temp);
    	
    	slow = head;
    	fast = head;
    	for(int i = 0; i < loopLen; i++) {
    		fast = fast.next;
    	}
    	while(fast != slow) {
    		fast = fast.next;
    		slow = slow.next;
    	}
    	return fast;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
