
public class LinkedListCycle {

	// https://leetcode.com/problems/linked-list-cycle/
	public static boolean hasCycle(ListNode head) {
		while (head != null) {
			if (head.next == head) {
				return true;
			}
			ListNode next = head.next;
			head.next = head;
			head = next;
		}
		return false;
	}

	
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}

