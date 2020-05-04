package harsha.practice.queue;

import harsha.practice.commons.QueueOverFlowError;
import harsha.practice.commons.QueueUnderFlowError;
import harsha.practice.stack.StackLogic;

public class QueueUsing2StacksLogic<T> {

	StackLogic<T> fowrwardStack;
	StackLogic<T> reverseStack;

	public QueueUsing2StacksLogic() {
		fowrwardStack = new StackLogic<T>();
		reverseStack = new StackLogic<T>();
	}

	public void enqueue(T data) {
		if (fowrwardStack.isFull() || reverseStack.isFull()) {
			throw new QueueOverFlowError();
		}

		if (fowrwardStack.isEmpty()) {
			while (!reverseStack.isEmpty()) {
				fowrwardStack.push(reverseStack.pop());
			}
		}
		fowrwardStack.push(data);
	}

	public T dequeue() {

		if (fowrwardStack.isEmpty() && reverseStack.isEmpty()) {
			throw new QueueUnderFlowError();
		}

		if (reverseStack.isEmpty()) {
			while (!fowrwardStack.isEmpty()) {
				reverseStack.push(fowrwardStack.pop());
			}
		}
		return reverseStack.pop();
	}

	public void showQueue() {
		if (fowrwardStack.isFull()) {
			while (!fowrwardStack.isEmpty()) {
				reverseStack.push(fowrwardStack.pop());
			}
		}
		StackLogic<T> reverseStackCopy = reverseStack;

		while (!reverseStackCopy.isEmpty()) {
			System.out.println(reverseStackCopy.pop());
		}

	}

}
