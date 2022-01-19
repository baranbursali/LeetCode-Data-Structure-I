public class SearchA2DMatrix {

	// https://leetcode.com/problems/search-a-2d-matrix/
	boolean searchMatrix(int[][] mat, int target) {
		int[] flatArr = new int[mat.length * mat[0].length];
		int ind = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				flatArr[ind++] = mat[i][j];
			}
		}

		return binarySearch(flatArr, 0, flatArr.length - 1, target) != -1;
	}

	int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}
}
