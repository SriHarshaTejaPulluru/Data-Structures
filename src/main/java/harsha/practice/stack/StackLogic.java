package harsha.practice.stack;

import harsha.practice.commons.CommonConstants;
import harsha.practice.commons.Node;
import harsha.practice.commons.StackUnderflowError;

public class StackLogic<T> {

	private static final int MAX_SIZE = 10;
	private int size;
	private Node<T> top;

	public void push(T data) throws StackOverflowError {
		if (isFull()) {
			throw new StackOverflowError(CommonConstants.STACK_OVER_FLOW_ERROR);
		}
		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNext(top);
		top = node;
		size++;

	}

	public T pop() throws StackUnderflowError {
		if (isEmpty()) {
			throw new StackUnderflowError(CommonConstants.STACK_UNDER_FLOW_ERROR);
		}
		T data = top.getData();
		top = top.getNext();
		size--;
		return data;
	}

	public T peek() throws StackUnderflowError {
		if (getSize() == 0) {
			throw new StackUnderflowError(CommonConstants.STACK_UNDER_FLOW_ERROR);
		}
		return top.getData();
	}

	public void showStack() {
		Node<T> n = top;
		while (n.getNext() != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
		System.out.println(n.getData());
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return size == MAX_SIZE;
	}

	public int getSize() {
		return size;
	}

}
