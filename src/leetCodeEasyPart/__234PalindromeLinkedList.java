/*Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?*/

package leetCodeEasyPart;

public class __234PalindromeLinkedList {
	
    public boolean isPalindrome(ListNode head) {
    	int len = 1;
    	if(head == null || head.next == null)
    		return true;
    	ListNode temp = head;
    	while(temp.next != null) {
    		temp = temp.next;
    		len++;
    	}
    	temp = head;
    	if(len % 2 == 0) {
    		for(int i = 0; i < len / 2; i++) {
    			temp = temp.next;
    		}
    		temp = reverseList(temp);
    		for(int i = 0; i < len / 2; i++) {
    			if(temp.val != head.val)
    				return false;
    			temp = temp.next;
    			head = head.next;
    		}
    	}else {
    		for(int i = 0; i < len / 2 + 1; i++) {
    			temp = temp.next;
    		}
    		temp = reverseList(temp);
    		for(int i = 0; i < len / 2; i++) {
    			if(temp.val != head.val)
    				return false;
    			temp = temp.next;
    			head = head.next;
    		}
    	}
    	return true;
    }
    
    public ListNode reverseList(ListNode head) {
    	ListNode pre = null;
    	ListNode cur = head;
    	if(head == null || head.next == null)
    		return head;
    	while(cur == null) {
    		ListNode next = cur.next;
    		cur.next = pre;
    		pre = cur;
    		cur = next;
    	}
    	return pre;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
