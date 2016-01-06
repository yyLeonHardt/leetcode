/*Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]*/

package leetCodeEasyPart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _118PascalsTriangle {
	
	public List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> element = new ArrayList<Integer>();
		
		if(numRows == 0){
			return triangle;
		}
		
		if(numRows - 1 == 0){
			element.add(1);
			triangle.add(element);
			return triangle;
		}
		
		element.add(1);
		triangle.add(element);
		element = new ArrayList<Integer>();

		
		if(numRows - 1 == 1){
			element.add(1);
			element.add(1);
			triangle.add(element);
			return triangle;
		}
		
		element.add(1);
		element.add(1);
		triangle.add(element);
		element = new ArrayList<Integer>();
		
	    
		for(int i = 2; i < numRows; i++){
			for(int j = 0; j <= i/2; j++){
				if(j == 0){
					element.add(1);
				}else{
					element.add(triangle.get(i-1).get(j) + triangle.get(i-1).get(j-1));
				}
					
			}
			for(int j = i/2 + 1; j <= i; j++){
				element.add(element.get(i-j));
			}
			triangle.add(element);
			element = new ArrayList<Integer>();

		}
		
		return triangle;
	}
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numRows = input.nextInt();
		input.close();
		_118PascalsTriangle pt = new _118PascalsTriangle();
		List<List<Integer>> tri = pt.generate(numRows);
		System.out.println(tri);

	}

}
