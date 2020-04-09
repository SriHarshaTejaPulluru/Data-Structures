package harsha.practice.linkedList;

import harsha.practice.commons.Node;

/**
 * 
 * This class provides all the logics i.e. basically implementations
 * 
 * @author Harsha.Pulluru
 * @param <T>
 * 
 */
public class LinkedListLogic<T> {

	Node<T> head;
	int size;

	/**
	 * @param data input element This method inserts the data in to linked list
	 */
	public void insert(T data) {
		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNext(null);
		if (head == null) {
			head = node;
		} else {
			Node<T> n = head;
			while (n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}
		size++;
	}

	/**
	 * This method prints the list of nodes that are present
	 */
	public void showList() {
		Node<T> n = head;
		while (n.getNext() != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
		System.out.println(n.getData());
	}

	/**
	 * This method inserts the particular element at start of the linked list
	 * 
	 * @param data input String
	 */
	public void insertFirst(T data) {
		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNext(head);
		head = node;
		size++;
	}

	/**
	 * @param index index where the element needs to be inserted
	 * @param data input string
	 */
	public void insertAt(int index, T data) {
		if (index == 0) {
			insertFirst(data);
		} else {
			int currentIndex = 0;
			Node<T> n = head;
			while (n.getNext() != null) {
				currentIndex++;
				if (currentIndex == index) {
					Node<T> node = new Node<T>();
					node.setData((T) data);
					node.setNext(n.getNext());
					n.setNext(node);
					break;
				} else {
					n = n.getNext();
				}
				size++;
			}
		}
	}

	/**
	 * @param index index where the value needs to be deleted
	 */
	public void deleteAt(int index) {

		if (index == 0) {
			head = head.getNext();
		} else {
			Node<T> n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.getNext();
			}
			Node<T> node = n.getNext();
			n.setNext(node.getNext());
			node = null;
		}
		size--;
	}

	/**
	 * clears the elements in linked list. For this, just make the head to null
	 */
	public void clear() {
		head = null;
	}

	public boolean isEmpty() {
		return size == 0;
	}

}
