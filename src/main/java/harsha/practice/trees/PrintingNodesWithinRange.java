package harsha.practice.trees;

import harsha.practice.commons.HelperUtility;

@SuppressWarnings("rawtypes")
public class PrintingNodesWithinRange {

	public static void main(String[] args) {
		Node root = HelperUtility.getRoot();
		printNodesWithinRange(root, 5, 15);// both values are inclusive
	}

	private static void printNodesWithinRange(Node<Integer> root, int low, int high) {

		if (root == null) {
			return;
		}
		if (low <= root.getData()) {
			printNodesWithinRange(root.getLeftChild(), low, high);
		}

		if (low <= root.getData() && root.getData() <= high) {
			System.out.println(root.getData() + ", ");
		}

		if (root.getData() <= high) {
			printNodesWithinRange(root.getRightChild(), low, high);
		}
	}

}
