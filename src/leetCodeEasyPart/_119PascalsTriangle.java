/*Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?*/

package leetCodeEasyPart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class _119PascalsTriangle {
	
	public List<Integer> getRow(int rowIndex) {
	    List<Integer> tri = new ArrayList<Integer>();
	    int[] temp = new int [rowIndex + 1];
	    
	    if(rowIndex == 0){
	    	tri.add(1);
	    	return tri;
	    }
	    tri.add(1);
	    tri.add(1);
	    if(rowIndex == 1){
	    	return tri;
	    }
	    
	    for(int i = 2; i < rowIndex + 1; i++){
	    	tri.add(0);
	    }
	    
	    Iterator<Integer> it = tri.iterator();
	    for(int i = 0; it.hasNext(); i++){	    	
	    	temp[i] = it.next();
	    }
	       
	    
	    for(int i = 2; i <= rowIndex; i++){
	    	for(int j = 0; j < i/2 + 1; j++){
	    		if(j == 0){
		    		tri.set(j, 1);
		    	}else{
		    		tri.set(j, temp[j] + temp[j - 1]);
		    	}
	    	}
	    	for(int j = i/2 + 1; j <= i; j++){
	    		tri.set(j, tri.get(i - j));
	    	}
	    	
	    	Iterator<Integer> iterator = tri.iterator();
	    	for(int n = 0; iterator.hasNext(); n++){
	    		temp[n] = iterator.next();
	    	}
	    		    	
	    }
	    
	    return tri;	
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rowIndex = input.nextInt();
		input.close();
		_119PascalsTriangle pt = new _119PascalsTriangle();
		List<Integer> tri = pt.getRow(rowIndex);
		System.out.println(tri);

	}

}
