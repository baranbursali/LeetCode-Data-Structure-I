import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/
public class ImplementQueueUsingStacks {

	Stack<Integer> taker = new Stack<Integer>();
	Stack<Integer> keeper = new Stack<Integer>();

	public void push(int x) {
		taker.add(x);
	}

	public int pop() {
		keeper = mover(keeper, taker);
		int popped = keeper.pop();
		taker = mover(taker, keeper);
		return popped;
	}

	public int peek() {
		keeper = mover(keeper, taker);
		int peeked = keeper.peek();
		taker = mover(taker, keeper);
		return peeked;
	}

	public boolean empty() {
		return taker.isEmpty();

	}

	public Stack<Integer> mover(Stack<Integer> target, Stack<Integer> source) {
		target.clear();
		while (!source.isEmpty()) {
			target.add(source.pop());
		}
		return target;
	}
}
