public class SearchinaBinarySearchTree {

	// https://leetcode.com/problems/search-in-a-binary-search-tree/
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null || root.val == val) {
			return root;
		}
		if (root.left != null) {
			TreeNode node = searchBST(root.left, val);
			if (node != null && node.val == val) {
				return node;
			}
		}
		if (root.right != null) {
			TreeNode node = searchBST(root.right, val);
			if (node != null && node.val == val) {
				return node;
			}
		}
		return null;
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
