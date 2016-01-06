/*Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/

package leetCodeEasyPart;

public class _189RotateArray {
	
	public void rotate(int[] nums, int k) {
		int length = nums.length;	
		for(int i = 0; i < k; i++){
			int temp = nums[length - 1];
			for(int j = length - 1; j > 0; j--){
				nums[j] = nums[j - 1];
			}
			nums[0] = temp;
		}
		return;
        
    }
	

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		_189RotateArray r = new _189RotateArray();
		r.rotate(nums, 3);

	}

}
