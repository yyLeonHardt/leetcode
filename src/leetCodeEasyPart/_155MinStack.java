/*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.*/

package leetCodeEasyPart;

public class _155MinStack {
	
	int[] temp = new int[100000];
	int top = 0;

    public void push(int x) {
        temp[top] = x;
        top++;
    }

    public void pop() {
        if(top - 1 > -1)
        	top--;
    }

    public int top() {

    	return temp[top - 1];
    }

    public int getMin() {
        int min = temp[0];
        for(int i = 1; i < top; i++) {
        	if(temp[i] < min)
        		min = temp[i];
        }
        return min;
    }
    
}
