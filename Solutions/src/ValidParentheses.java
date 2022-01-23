import java.util.Stack;

public class ValidParentheses {

	// https://leetcode.com/problems/valid-parentheses/
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char[] open = { '(', '[', '{' };
		char[] close = { ')', ']', '}' };
		for (Character c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.add(c);
			}
			for (int j = 0; j < close.length; j++) {
				if (c == close[j]) {
					if (!stack.isEmpty() && open[j] == stack.pop()) {
						break;
					} else {
						return false;
					}

				}
			}
		}
		return stack.isEmpty();
	}
}
