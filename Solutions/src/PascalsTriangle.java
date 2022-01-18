import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	// https://leetcode.com/problems/pascals-triangle/
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int[][] dp = new int[30][31];
		List<Integer> dim0 = new ArrayList<Integer>();
		dp[0][0] = 1;
		dp[1][0] = 1;
		dp[1][1] = 1;
		dim0.add(1);
		ans.add(dim0);
		if (numRows == 1) {
			return ans;
		}
		dim0 = new ArrayList<Integer>();
		dim0.add(1);
		dim0.add(1);
		ans.add(dim0);
		for (int i = 2; i < numRows; i++) {
			dp[i][0] = 1;
			dim0 = new ArrayList<Integer>();
			dim0.add(1);
			for (int j = 1; j <= i; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				dim0.add(dp[i][j]);
			}
			ans.add(dim0);
		}
		return ans;
	}
}
