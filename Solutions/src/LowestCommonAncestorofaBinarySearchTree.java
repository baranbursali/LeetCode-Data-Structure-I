import java.util.HashMap;

public class LowestCommonAncestorofaBinarySearchTree {
	public HashMap<TreeNode, Boolean> map = new HashMap<>();

	// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		int pV = p.val;
		int qV = q.val;
		TreeNode node = root;
		TreeNode ans = root;
		while (node != null) {
			map.put(node, false);
			if (pV > node.val) {
				node = node.right;
			} else {
				node = node.left;
			}
		}
		while (root != null) {
			if (map.get(root) != null) {
				ans = root;
				if (ans == p || ans == q)
					return ans;
			}
			if (qV > root.val) {
				root = root.right;
			} else {
				root = root.left;
			}
		}
		return ans;
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
