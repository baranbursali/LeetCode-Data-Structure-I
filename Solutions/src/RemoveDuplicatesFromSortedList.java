public class RemoveDuplicatesFromSortedList {

	// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode ans = head;
		while (head != null) {
			head.next = getDiffNode(head.next, head.val);
			head = head.next;
		}
		return ans;
	}

	public ListNode getDiffNode(ListNode node, int val) {
		while (node != null) {
			if (node.val != val) {
				return node;
			}
			node = node.next;
		}
		return node;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
