import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIVInputisaBST {

	public HashMap<Integer, Boolean> map = new HashMap<>();
	public ArrayList<Integer> arr = new ArrayList<>();

	// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
	public boolean findTarget(TreeNode root, int k) {
		traversalArr(root);
		int i = 0;
		int j = arr.size() - 1;
		while (i < j) {
			if (arr.get(i) + arr.get(j) == k) {
				return true;
			} else if (arr.get(i) + arr.get(j) > k) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

	void traversalArr(TreeNode node) {
		if (node != null) {
			traversalArr(node.left);
			arr.add(node.val);
			traversalArr(node.right);
		}
	}

	public boolean findTargetWithMap(TreeNode root, int k) {

		traversalMap(root);
		for (Map.Entry<Integer, Boolean> e : map.entrySet()) {
			e.setValue(false);
			if (map.containsKey(k - e.getKey()) && map.get(k - e.getKey())) {
				return true;
			}
		}

		return false;
	}

	void traversalMap(TreeNode node) {
		if (node != null) {
			traversalMap(node.left);
			map.put(node.val, true);
			traversalMap(node.right);
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
