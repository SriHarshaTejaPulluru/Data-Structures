package harsha.practice.trees;

import harsha.practice.commons.HelperUtility;

@SuppressWarnings( "rawtypes" )
public class DepthFirstSearch {

	public static void main(String[] args) {

		Node root = HelperUtility.getRoot();
		preOrderTraversal(root);
		System.out.println();
		inOrderTraversal(root);
		System.out.println();
		postOrderTraversal(root);
		
	}

	private static void postOrderTraversal(Node node) {

		if(node==null) {
			return;
		}
		postOrderTraversal(node.getLeftChild());
		postOrderTraversal(node.getRightChild());
		print(node);
		
	}

	public static void inOrderTraversal(Node root) {

		if (root == null) {
			return;
		}

		inOrderTraversal(root.getLeftChild());
		print(root);
		inOrderTraversal(root.getRightChild());
	}

	private static void preOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		print(node);
		preOrderTraversal(node.getLeftChild());
		preOrderTraversal(node.getRightChild());
	}

	private static void print(Node root) {
		System.out.print(root.getData() + "->");
	}

}
