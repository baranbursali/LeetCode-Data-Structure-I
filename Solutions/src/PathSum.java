public class PathSum {
	public boolean ans = false;

	// https://leetcode.com/problems/path-sum/
	public boolean hasPathSum(TreeNode root, int targetSum) {
		traverse(root, 0, targetSum);
		return ans;
	}

	public void traverse(TreeNode node, int val, int target) {
		if (node != null) {
			if (node.left == null && node.right == null) {
				val += node.val;
				if (val == target) {
					ans = true;
				}
			} else {
				val += node.val;
				traverse(node.left, val, target);
				traverse(node.right, val, target);
			}
		}
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
