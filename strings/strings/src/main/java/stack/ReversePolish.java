package stack;

import java.util.Stack;

public class ReversePolish {

	public static void main(String[] args) {

		ReversePolish p = new ReversePolish();
		System.out.println(p.evaluateExpression("4,13,5,/,+"));
	}

	public int evaluateExpression(String expression) {

		Stack<Integer> expressionStack = new Stack<Integer>();

		String expArr[] = expression.split(",");

		for (String s : expArr) {

			if (s.equals("+")) {

				int x = expressionStack.pop();
				int y = expressionStack.pop();
				expressionStack.push(add(x, y));
			} else if (s.equals("*")) {

				int x = expressionStack.pop();
				int y = expressionStack.pop();
				expressionStack.push(mul(x, y));

			} else if (s.equals("/")) {

				int x = expressionStack.pop();
				int y = expressionStack.pop();
				expressionStack.push(div(x, y));

			} else if (s.equals("-")) {

				int x = expressionStack.pop();
				int y = expressionStack.pop();
				expressionStack.push(sub(x, y));

			} else {
				expressionStack.push(Integer.parseInt(s));
			}

		}

		return expressionStack.pop();

	}

	private Integer sub(int x, int y) {
		return y - x;
	}

	private Integer div(int x, int y) {
		return y / x;
	}

	private int add(int x, int y) {
		return y + x;
	}

	private int mul(int x, int y) {
		return y * x;
	}

}
