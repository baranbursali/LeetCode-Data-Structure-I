import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
	List<Integer> l = new ArrayList<>();

	// https://leetcode.com/problems/binary-tree-inorder-traversal/
	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null)
			return l;
		if (root.left != null)
			inorderTraversal(root.left);
		l.add(root.val);
		if (root.right != null)
			inorderTraversal(root.right);
		return l;
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
