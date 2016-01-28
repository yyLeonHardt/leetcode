/*According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies, as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population..
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
Write a function to compute the next state (after one update) of the board given its current state.

Follow up: 
Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?*/

package leetCodeMediumPart;

public class _289GameOfLife {
	
	//Method 1:
	//Creat a new 2D array with the same size as the board to store the 
	//updated state and then use it to update the board.
	//O(nm)
    public void gameOfLifeMethod1(int[][] board) {
        int row = board.length;
        int column = board[0].length;
        int[][] temp = new int[row][column];
        int cnt = 0;
        for(int i = 0; i < row; i++) {
        	for(int j = 0; j < column; j++) {
        		cnt = countState(i, j, board);
        		if(board[i][j] == 1) {
        			if(cnt < 2 || cnt > 3) {
        				temp[i][j] = 0;
        			}else {
        				temp[i][j] = 1;
        			}
        		}else {
        			if(cnt == 3) {
        				temp[i][j] = 1;
        			}
        		}
        	}
        }
        for(int i = 0; i < row; i++) {
        	for(int j = 0; j < column; j++) {
        		board[i][j] = temp[i][j];
        	}
        }
    }
    
    public int countState(int i, int j, int[][] board) {
    	int row = board.length;
    	int column = board[0].length;
    	int cnt = 0;
    	if(i != 0 && j != 0) {
    		cnt += board[i - 1][j - 1];
    	}
    	if(i != 0) {
    		cnt += board[i - 1][j];
    	}
    	if(j != column - 1 && i != 0) {
   			cnt += board[i - 1][j + 1];
   		}
   		if(j != column - 1) {
   			cnt += board[i][j + 1];
   		}
   		if(j != column - 1 && i != row - 1) {
   			cnt += board[i + 1][j + 1];
   		}
   		if(i != row - 1) {
   			cnt += board[i + 1][j];
   		}
   		if(i != row - 1 && j != 0) {
   			cnt += board[i + 1][j - 1];
   		}
   		if(j != 0) {
   			cnt += board[i][j - 1];
   		}
    	return cnt;
    }
    
    //Method 2:
    //Use two bit 00 to store the current state and next state.
    //The first bit represent next state and the second bit represent current state.
    //O(mn)
    public static void gameOfLifeMethod2(int[][] board) {
    	int row = board.length;
    	int column = board[0].length;
    	for(int i = 0; i < row; i++) {
    		for(int j = 0; j < column; j++) {
    			int cnt = countOfLife(i, j, board);
    			//For board[i][j] is 1 which is "01" in binary, if cnt < 2 or cnt > 3, 
    			//next state should be 0 and board[i][j] should be "01" which have no 
    			//change. Otherwise, next state should be 1 and board[i][j] should be 
    			//"11" which is 3 in decimal.
    			//For board[i][j] is 0 which is "00" in binary, if cnt == 3, next state
    			//will become 1 so we need to set board[i][j] as "10" that is 2 in decimal.
    			if((board[i][j] & 1) == 1) {
    				if(cnt == 2 || cnt == 3) {
    					board[i][j] = 3;
    				}
    			}else {
    				if(cnt == 3) {
    					board[i][j] = 2;
    				}
    			}
    		}
    	}
    	for(int i = 0; i < row; i++) {
    		for(int j = 0; j < column; j++) {
    			board[i][j] = board[i][j] >> 1; //Remove current state and leave next state. 
    		}
    	}
    }
    
    public static int countOfLife(int x, int y, int[][] board) {
    	int row = board.length;
    	int column = board[0].length;
    	int cnt = 0;
    	for(int i = Math.max(x - 1, 0); i <= Math.min(x + 1, row - 1); i++) {
    		for(int j = Math.max(y - 1, 0); j <= Math.min(y + 1, column + 1); j++) {
    			cnt += board[i][j] & 1;
    		}
    	}
    	cnt -= board[x][y] & 1;
    	return cnt;
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1, 1}, {0, 1}};
		gameOfLifeMethod2(a);
	}

}
