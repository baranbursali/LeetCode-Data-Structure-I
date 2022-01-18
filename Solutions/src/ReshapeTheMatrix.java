public class ReshapeTheMatrix {

	// https://leetcode.com/problems/reshape-the-matrix/
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int[][] ans = new int[r][c];
		int[] flatArr = new int[mat.length * mat[0].length];
		int ind = 0, ind2 = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				flatArr[ind++] = mat[i][j];
			}
		}
		if (flatArr.length != (r * c) || (r * c) == 1) {
			return mat;
		}
		ind = 0;
		for (int i = 0; i < r; i++) {
			int[] row = new int[c];
			for (int j = 0; j < c; j++) {
				row[j] = flatArr[ind2++];
			}
			ans[ind++] = row;
		}
		return ans;
	}

	/*
	 * better approach: for i in range(mat_row*mat_col): op[i//c][i%c] =
	 * mat[i//mat_col][i%mat_col]
	 */
}
