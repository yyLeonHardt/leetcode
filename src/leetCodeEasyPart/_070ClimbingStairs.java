package leetCodeEasyPart;

import java.util.Scanner;

public class _070ClimbingStairs {
	
	public int climbStairs(int i){

//Method 1:
//		int f0 = 0, f1 = 1;
//	    for(int n = 1; n <= i; n++) {
//	            f1 += f0;       // assign sum of f0 and f1 to f1 
//	            f0 = f1 - f0;   // assign previous f1 to f0
//	    }
//	    return f1;
		
//Method 2:
		if(i == 0)
			return 0;
		if(i == 1)
			return 1;
		int[] ways = new int[i];
		ways[0] = 1;
		ways [1] = 2;
		for(int j = 2; j < i; j++)
			ways[j] = ways[j - 1] + ways[j - 2];
		
		return ways[i - 1];
        
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();		
		input.close();
		
		_070ClimbingStairs c = new _070ClimbingStairs();
		int ways = c.climbStairs(i);
		System.out.println(ways);
		
	}

}
