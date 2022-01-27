import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {

	public List<Integer> arr = new ArrayList<>();

	// https://leetcode.com/problems/validate-binary-search-tree/
	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return false;
		}
		traversal(root);
		for (int i = 0; i < arr.size() - 1; i++) {
			if (arr.get(i) >= arr.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

	void traversal(TreeNode node) {
		if (node != null) {
			traversal(node.left);
			arr.add(node.val);
			traversal(node.right);

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
