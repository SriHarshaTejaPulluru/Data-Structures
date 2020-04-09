package harsha.practice.stack;

public class MinimumStack {
	private static StackLogic<Integer> originalStack = new StackLogic<Integer>();
	private static StackLogic<Integer> minimumStack = new StackLogic<Integer>();

	public void push(Integer data) {
		if (minimumStack.isEmpty()) {
			minimumStack.push(data);
		} else if (data < minimumStack.peek()) {
			minimumStack.push(data);
		} else {
			minimumStack.push(minimumStack.peek());
		}
		originalStack.push(data);
	}

	public int pop() {
		minimumStack.pop();
		return originalStack.pop();
	}

	public int minimumElement() {
		return minimumStack.peek();
	}
}
