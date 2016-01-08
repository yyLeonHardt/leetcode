/*Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?*/

package leetCodeEasyPart;

public class _234PalindromeLinkedList {
	
    public boolean isPalindrome(ListNode head) {
    	if(head == null || head.next == null) {
    		return true;
    	}
    	ListNode slow = head;
    	ListNode fast = head;
    	int cnt = 0;
    	while(fast.next != null && fast.next.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		cnt++;
    	}
    	ListNode end = null;
    	if(fast.next != null) {
    		end = reverseList(slow.next);
    		for(int i = 0; i <= cnt; i++) {
    			if(head.val != end.val) {
    				return false;
    			}
    			head = head.next;
    			end = end.next;
    		}
    	}else {
    		end = reverseList(slow.next);
    		for(int i = 0; i < cnt; i++) {
    			if(head.val != end.val) {
    				return false;
    			}
    			head = head.next;
    			end = end.next;
    		}
    	}
    	return true;
    }
    
    public ListNode reverseList(ListNode head) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
