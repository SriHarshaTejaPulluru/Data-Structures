package harsha.practice.linkedList;

/**
 * 
 * This class provides all the logics i.e. basically implementations
 * 
 * @author Harsha.Pulluru
 * 
 */
public class LinkedListLogic {

	Node head;

	/**
	 * @param data input element This method inserts the data in to linked list
	 */
	public void insert(String data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	/**
	 * This method prints the list of nodes that are present
	 */
	public void showList() {
		Node n = head;
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
	public void insertFirst(String data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	/**
	 * @param index index where the element needs to be inserted
	 * @param data input string
	 */
	public void insertAt(int index, String data) {

		if (index == 0) {
			insertFirst(data);
		} else {
			int currentIndex = 0;
			Node n = head;
			while (n.next != null) {
				currentIndex++;
				if (currentIndex == index) {
					Node node = new Node();
					node.data = data;
					node.next = n.next;
					n.next = node;
					break;
				} else {
					n = n.next;
				}
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
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			Node node = n.next;
			n.next = node.next;
			node = null;
		}

	}

}
