/*Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.*/

package leetCodeMediumPart;

public class _011ContainerWithMostWater {
	
	
	//Method 1:
	//Calculate every case and return the max area.
	//O(n2)
    public int maxAreaMethod1(int[] height) {
        int maxarea = 0;
        int len = height.length;
        for(int i = 0; i < len - 1; i++) {
        	for(int j = i + 1; j < len; j++) {
        		int temp = area(height, i, j);
        		if(temp > maxarea) {
        			maxarea = temp;
        		}
        	}
        }
        return maxarea;
    }
    
    
    //Method 2:
    //Initial two pointer at left-most and right-most index and calculate the area.
    //The final height of the container depends on the minimum height between left 
    //and right, so move the pointer which has a "lower" height to middle of the 
    //array by one step and then calculate the area, and then update the maximum 
    //area. Do this loop until left pointer meets right pointer.
    //O(n)
    public int maxAreaMethod2(int[] height) {
    	int len = height.length;
    	int left = 0;
    	int right = len - 1;
    	int tempLeft, tempRight;
    	int maxArea = 0, tempArea;
    	while(left < right) {
    		tempLeft = left;
    		tempRight = right;
    		tempArea = area(height, left, right);
    		if(tempArea > maxArea) {
    			maxArea = tempArea;
    		}
    		if(height[left] > height[right]) {
    			while(right > 0 && height[right] <= height[tempRight]) {
    				right--;
    			}
    		}else {
    			while(left < len && height[left] <= height[tempLeft]) {
    				left++;
    			}
    		}
    	}
    	return maxArea;
    }
    
    
    public int area(int[] height, int left, int right) {
    	int h = Math.min(height[left], height[right]);
    	return (right - left) * h;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
