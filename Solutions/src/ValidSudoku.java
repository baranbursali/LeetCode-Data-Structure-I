import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {

	}

	// https://leetcode.com/problems/valid-sudoku/
	static boolean isValidSudoku(char[][] board) {
		HashSet<Character> checker = new HashSet<>();
		// row
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.' && !checker.add(board[i][j])) {
					return false;
				}
			}
			checker.clear();
		}

		// column
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[j][i] != '.' && !checker.add(board[j][i])) {
					return false;
				}
			}
			checker.clear();
		}

		// trilece, could be optimized with index calculation
		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 3; l++) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						int r = k * 3 + i;
						int c = l * 3 + j;
						if (board[r][c] != '.' && !checker.add(board[r][c])) {
							return false;
						}
					}
				}

				checker.clear();
			}
		}

		return true;
	}

}
