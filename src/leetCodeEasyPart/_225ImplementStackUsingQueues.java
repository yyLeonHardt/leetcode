/*Implement the following operations of a stack using queues.

 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * Notes:
 * You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 * Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 * You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).*/

package leetCodeEasyPart;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
	
	Queue<Integer> pushQueue = new ArrayDeque<Integer>();
	Queue<Integer> popQueue = new ArrayDeque<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        pushQueue.offer(x);        
        for(int i = 0; i < pushQueue.size() - 1; i++)
        	pushQueue.offer(pushQueue.remove());
    }

    // Removes the element on top of the stack.
    public void pop() {

        pushQueue.remove();
    }

    // Get the top element.
    public int top() {
        return pushQueue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return pushQueue.isEmpty();
    }
}



public class _225ImplementStackUsingQueues {

	public static void main(String[] args) {


	}

}
