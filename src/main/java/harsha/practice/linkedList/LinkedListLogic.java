package harsha.practice.linkedList;

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
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		size++;
	}

	/**
	 * This method prints the list of nodes that are present
	 */
	public void showList() {
		Node<T> n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	/**
	 * This method inserts the particular element at start of the linked list
	 * 
	 * @param data input String
	 */
	public void insertFirst(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = head;
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
			while (n.next != null) {
				currentIndex++;
				if (currentIndex == index) {
					Node<T> node = new Node<T>();
					node.data = (T) data;
					node.next = n.next;
					n.next = node;
					break;
				} else {
					n = n.next;
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
			head = head.next;
		} else {
			Node<T> n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			Node<T> node = n.next;
			n.next = node.next;
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
