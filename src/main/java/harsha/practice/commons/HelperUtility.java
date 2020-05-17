package harsha.practice.commons;

import harsha.practice.trees.Node;

/**
 * This class is a helper methods class used for different sorting techniques
 * 
 * @author Harsha.Pulluru
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class HelperUtility {

	private static int[] array;
	static final int BOUNDARY_LIMIT = 1000;

	public static int[] getArray() {
		array = new int[BOUNDARY_LIMIT];
		for (int i = 0, j = BOUNDARY_LIMIT; i < BOUNDARY_LIMIT; i++, j--) {
			// array[i] = j; //reverse Order
			array[i] = i + 1;
		}
		return array;
	}

	public static void printElements(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	public static void swapElements(int[] arr, int i, int j) {
		int temp;
		temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;

	}

	
	public static Node getRoot() {
		Node root = new Node(8);
		Node b = new Node(6);
		Node c = new Node(14);
		Node d = new Node(4);
		Node e = new Node(7);
		Node f = new Node(18);
		Node g = new Node(16);
		root.setLeftChild(b);
		root.setRightChild(c);
		b.setLeftChild(d);
		b.setRightChild(e);
		c.setRightChild(f);
		f.setRightChild(g);
		return root;
	}

	public static void print(Node node) {
		if (node == null) {
			System.out.println("Node not found");

		} else {
			System.out.println("Element Found " + node.getData());
		}

	}

}
