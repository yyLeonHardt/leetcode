package leetCodeEasyPart;

public class _247DeleteNodeInALinkedList {
	
	public void deleteNode(ListNode node) {
        if(node != null && node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

	public static void main(String[] args) {

	}

}
