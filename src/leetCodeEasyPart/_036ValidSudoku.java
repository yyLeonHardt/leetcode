/*Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.*/

package leetCodeEasyPart;

import java.util.HashSet;
import java.util.Set;

public class _036ValidSudoku {
	
	private static boolean isRowValid(char[][] board) {
		
		
		for(int i = 0; i < 9; i++) {
			Set<Character> temp = new HashSet<Character>();
			for(int j = 0; j < 9; j++) {
				if(board[i][j] != '.' && !temp.add(board[i][j])){
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean isColumnValid(char[][] board) {
		
		for(int i = 0; i < 9; i++) {
			Set<Character> temp = new HashSet<Character>();
			for(int j = 0; j < 9; j++) {
				if(board[j][i] != '.' && !temp.add(board[j][i])){
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean isBlockValid(char[][] board, int row, int column) {
		Set<Character> temp = new HashSet<Character>();
		for(int i = row; i < row + 3; i++) {
			for(int j = column; j < column + 3; j++) {
				if(board[i][j] != '.' && !temp.add(board[i][j]))
					return false;
			}
		}
		return true;
	}

    public static boolean isValidSudoku(char[][] board) {
        return isRowValid(board) && isColumnValid(board) && isBlockValid(board, 0, 0) && isBlockValid(board, 0, 3) && isBlockValid(board, 0, 6) && isBlockValid(board, 3, 0) & isBlockValid(board, 3, 3) && isBlockValid(board, 3, 6) && isBlockValid(board, 6, 0) && isBlockValid(board, 6, 3) && isBlockValid(board, 6, 6);
    }
    
    
	public static void main(String[] args) {
		char[][] board = {{'.', '8', '7', '6', '5', '4', '3', '2', '1'}, {'2', '.', '.', '.', '.', '.', '.', '.', '.' }, {'3', '.', '.', '.', '.', '.', '.', '.', '.' }, {'4', '.', '.', '.', '.', '.', '.', '.', '.' }, {'5', '.', '.', '.', '.', '.', '.', '.', '.' }, {'6', '.', '.', '.', '.', '.', '.', '.', '.' }, {'7', '.', '.', '.', '.', '.', '.', '.', '.' }, {'8', '.', '.', '.', '.', '.', '.', '.', '.' }, {'9', '.', '.', '.', '.', '.', '.', '.', '.' }};
		System.out.println(isValidSudoku(board));
	}

}
