
public class RemoveLinkedListElements {

	// https://leetcode.com/problems/remove-linked-list-elements
	public ListNode removeElements(ListNode head, int val) {
		ListNode headReal = getNonValuedNode(head, val);
		head = getNonValuedNode(head, val);

		while (true) {
			if (head == null) {
				break;
			}
			head.next = getNonValuedNode(head.next, val);
			head = head.next;
		}
		return headReal;
	}

	public ListNode getNonValuedNode(ListNode node, int val) {
		while (node != null && node.val == val) {
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
