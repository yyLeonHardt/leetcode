/*Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

Rectangle Area
Assume that the total area is never beyond the maximum possible value of int.*/

package leetCodeEasyPart;

public class _223RectangleArea {
	
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	 if(B >= H || E >= C || F >= D || A >= G)
     		return (D - B) * (C - A) + (H - F) * (G - E);
     	else {
     		int area1 = (B - F) * (E - A);
     		if(area1 < 0)
     			area1 = 0;
     		int area2 = (D - H) * (G - C);
     		if(area2 < 0)
     			area2 = 0;
     		int area3 = (E - A) * (H - D);
     		if(area3 < 0)
     			area3 = 0;
     		int area4 = (B - F) * (C - G);
     		if(area4 < 0)
     			area4 = 0;
     		return (Math.max(C, G) - Math.min(A, E)) * (Math.max(D, H) - Math.min(B, F)) - area1 - area2 - area3- area4;
     	}
    }

	public static void main(String[] args) {
		System.out.println(computeArea(-2, -2, 2, 2, 1, -3, 3, -1));

	}

}
