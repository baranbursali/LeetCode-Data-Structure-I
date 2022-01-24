import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
	List<Integer> l = new ArrayList<>();

	// https://leetcode.com/problems/binary-tree-postorder-traversal/
	public List<Integer> postorderTraversal(TreeNode root) {
		if (root == null)
			return l;
		if (root.left != null)
			postorderTraversal(root.left);
		if (root.right != null)
			postorderTraversal(root.right);
		l.add(root.val);
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
