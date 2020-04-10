package harsha.practice.queue;

import java.lang.reflect.Array;

import harsha.practice.commons.QueueOverFlowError;
import harsha.practice.commons.QueueUnderFlowError;

public class CircularQueueLogic<T> {

	private static final int EMPTY_VALUE = -1;
	private int front = EMPTY_VALUE;
	private int rear = EMPTY_VALUE;
	private static final int MAX_SIZE = 4;
	private T[] elememts;

	@SuppressWarnings("unchecked")
	public CircularQueueLogic(Class<T> clazz) {
		elememts = (T[]) Array.newInstance(clazz, MAX_SIZE);
	}

	public void enqueue(T data) {
		if (isFull()) {
			throw new QueueOverFlowError();
		}
		rear = (rear + 1) % MAX_SIZE;
		elememts[rear] = data;
		if (front == EMPTY_VALUE) {
			front = rear;
		}
	}

	public T dequeue() {
		if (isEmpty()) {
			throw new QueueUnderFlowError();
		}
		T data = elememts[front];
		if (front == rear) {
			front = EMPTY_VALUE;
		} else {
			front = (front + 1) % MAX_SIZE; 
		}
		return data;

	}

	public void showQueue() {
		for (int i = front; i <= rear; i++) {
			System.out.println(elememts[i]);
		}
	}

	private boolean isEmpty() {

		return front == EMPTY_VALUE;
	}

	private boolean isFull() {

		int tail = (rear + 1) % MAX_SIZE;
		return tail == front;
	}

}
