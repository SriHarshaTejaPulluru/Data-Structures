package harsha.practice.linkedList;

/**
 * @author Harsha.Pulluru
 *
 * Linked List Demo main class
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedListLogic lList = new LinkedListLogic();
		lList.insert("Sri");
		lList.insert("Harsha");
		lList.insert("Hello");
		lList.insert("Teja");
		lList.deleteAt(2);
		lList.showList();
	}
}
