package leetCodeEasyPart;

public class _160IntersectionOfTwoLinkedLists {

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}


	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    	
	    if(headA == null || headB == null){
	    	return null;
	    }
	    	
	    ListNode pathA = headA;
	    ListNode pathB = headB;
	    int lengthA = 0;
	    int lengthB = 0;
	    while(pathA.next != null){
	    	lengthA++;
	    	pathA = pathA.next;
	    }
	    while(pathB.next != null){
	    	lengthB++;
	    	pathB = pathB.next;
	    }
	    	
	    int lendiff = lengthA - lengthB;
	    pathA = headA;
	    pathB = headB;
	    	
	    if(lendiff > 0){
	    	while(lendiff > 0){
	    		pathA = pathA.next;
	    		lendiff--;
	    	}
	    }else if(lendiff < 0){
	    	while(lendiff < 0){
	    		pathB = pathB.next;
	    		lendiff++;
	    	}
	    }
	    	
	    while(pathA != null){
	    	if(pathA == pathB){
	    		return pathA;
	    	}
	    	pathA = pathA.next;
	    	pathB = pathB.next;
	    }
	    	
	    return null;	        

	}
		
	public static void main(String[] args) {
		

	}

}
