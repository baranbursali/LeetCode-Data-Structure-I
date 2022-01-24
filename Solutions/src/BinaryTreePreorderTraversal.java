import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreorderTraversal {
	List<Integer> preorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> list = new ArrayList<Integer>();
		stack.add(root);
		TreeNode node = root;
		if (node == null) {
			return list;
		}
		while (!stack.isEmpty()) {
			list.add(node.val);
			if (node.right != null)
				stack.add(node.right);
			if (node.left != null)
				stack.add(node.left);
			node = stack.pop();
		}
		return list;
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
