package harsha.practice.trees;

import harsha.practice.commons.HelperUtility;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class BinarySearchTree {

	public static void main(String[] args) {
		Node root = HelperUtility.getRoot();
		Node searchOrInsertNode = new Node(2);
	//	binarySearchInsert(root, searchOrInsertNode);
		DepthFirstSearch.inOrderTraversal(root);
		print(binarySearchLookUp(root, searchOrInsertNode));

	}

	private static void print(Node<Integer> searchedNode) {
		if (searchedNode == null) {
			System.out.println("Not Found");
		} else {
			System.out.println("Element Found");
		}
	}

	private static Node<Integer> binarySearchLookUp(Node<Integer> root, Node<Integer> node) {
		if (root == null) {
			return null;
		}
		if (root.getData() == node.getData()) {
			return node;
		}

		if (root.getData() < node.getData()) {
			return binarySearchLookUp(root.getRightChild(), node);
		} else {
			return binarySearchLookUp(root.getLeftChild(), node);
		}
	}

	private static Node<Integer> binarySearchInsert(Node<Integer> root, Node<Integer> node) {

		if (root == null) {
			return node;
		}
		if (node.getData() <= root.getData()) {
			root.setLeftChild(binarySearchInsert(root.getLeftChild(), node));
		} else {
			root.setRightChild(binarySearchInsert(root.getRightChild(), node));
		}
		return root;
	}

}
