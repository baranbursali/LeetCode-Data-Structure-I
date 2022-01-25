import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

	// https://leetcode.com/problems/binary-tree-level-order-traversal/
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (root == null) {
			return ans;
		}
		List<TreeNode> a = new ArrayList<>();
		List<TreeNode> b = new ArrayList<>();

		a.add(root);
		while (!a.isEmpty()) {
			List<Integer> tmp = new ArrayList<>();
			b = new ArrayList<>();
			for (int i = 0; i < a.size(); i++) {
				tmp.add(a.get(i).val);
				if (a.get(i).left != null) {
					b.add(a.get(i).left);
				}
				if (a.get(i).right != null) {
					b.add(a.get(i).right);
				}
			}
			ans.add(tmp);
			a = b;
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
