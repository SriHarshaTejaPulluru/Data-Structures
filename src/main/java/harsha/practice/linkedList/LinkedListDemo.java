package harsha.practice.linkedList;

/**
 * @author Harsha.Pulluru
 *
 * Linked List Demo main class
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedListLogic<String> lList = new LinkedListLogic<String>();
		lList.insert("Sri");
		lList.insert("Harsha");
		lList.insert("Hello");
		lList.insert("Teja");
		lList.deleteAt(2);
		lList.showList();
		System.out.println(lList.size);
		System.out.println(lList.isEmpty());
		
		
		LinkedListLogic<Integer> integerList = new LinkedListLogic<Integer>();
		integerList.insert(1);
		integerList.insert(2);
		integerList.insert(3);
		integerList.insert(4);
		integerList.deleteAt(2);
		integerList.showList();
		System.out.println(lList.size);
		System.out.println(lList.isEmpty());
		
	}
}
