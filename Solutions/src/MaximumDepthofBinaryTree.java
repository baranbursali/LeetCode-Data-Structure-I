public class MaximumDepthofBinaryTree {
	// https://leetcode.com/problems/maximum-depth-of-binary-tree/
	public int maxDepth(TreeNode root) {
		return maxDepth(root, 0);
	}

	public int maxDepth(TreeNode node, int depth) {
		if (node == null) {
			return depth;
		}
		return Math.max(maxDepth(node.left, depth + 1), maxDepth(node.right, depth + 1));

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
