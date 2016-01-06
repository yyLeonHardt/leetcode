/*Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.*/

package leetCodeEasyPart;

public class _021MergeTwoSortedLists {
	
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

//Method 1:
//		 if(l1 == null && l2 == null)
//			 return null;
//		 else if(l1 == null && l2 != null)
//			 return l2;
//		 else if(l1 != null && l2 == null)
//			 return l1;
//		 
//		 ListNode temp;
//		 if(l1.val >= l2.val) {
//			 temp = l2;
//			 l2 = l2.next;
//		 }else {
//			 temp = l1;
//			 l1 = l1.next;
//		 }
//		 ListNode head = temp;
//		 while(l1 != null || l2 != null) {
//			 if(l1 == null) {
//				 temp.next = l2;
//				 break;
//			 }
//			 if(l2 == null){
//				 temp.next = l1;
//				 break;
//			 }
//			 if(l1.val >= l2.val) {
//				 temp.next = l2;
//				 l2 = l2.next;
//				 temp = temp.next;
//			 }else {
//				 temp.next = l1;
//				 l1 = l1.next;
//				 temp = temp.next;
//			 }
//		 }
//		 
//		 return head;
		 
//Method 2:
		 if(l1 == null)
			 return l2;
		 if(l2 == null)
			 return l1;
		 
		 if(l1.val <= l2. val) {
			 l1.next = mergeTwoLists(l1.next, l2);
			 return l1;
		 }else {
			 l2.next = mergeTwoLists(l1, l2.next);
			 return l2;
		 }
		 
	 }
	 
	public static void main(String[] args) {

	}

}
