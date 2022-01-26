
public class InsertIntoaBinarySearchTree {

	// https://leetcode.com/problems/insert-into-a-binary-search-tree/
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		TreeNode ans = root;
		traverse(root, val);
		return ans;
	}

	public void traverse(TreeNode node, int val) {
		if (node.val > val) {
			if (node.left != null) {
				traverse(node.left, val);
			} else {
				node.left = new TreeNode(val);
			}
		}
		if (node.val < val) {
			if (node.right != null) {
				traverse(node.right, val);
			} else {
				node.right = new TreeNode(val);
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
