public class InvertBinaryTree {
	// https://leetcode.com/problems/invert-binary-tree/
	public TreeNode invertTree(TreeNode node) {
		if (node != null) {
			TreeNode tmpNode = node.right;
			node.right = node.left;
			node.left = tmpNode;
			invertTree(node.left);
			invertTree(node.right);
		}
		return node;
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
