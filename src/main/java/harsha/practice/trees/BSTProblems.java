package harsha.practice.trees;

import harsha.practice.commons.HelperUtility;

@SuppressWarnings("rawtypes")
public class BSTProblems {

	public static void main(String[] args) {

		Node root = HelperUtility.getRoot();
		// Node node = findMinimumValue(root);
		// Node node = findMaximumValue(root);
		// int maxDepthOfBST = findMaxDepth(root);
		// printMaxDepthBST(maxDepthOfBST);
		// HelperUtility.print(node);	
		mirror(root);
		System.out.println();
		DepthFirstSearch.inOrderTraversal(root);
	}

	private static void mirror(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData()+"->");
		

		mirror(root.getLeftChild());
		mirror(root.getRightChild());
		Node temp = root.getLeftChild();
		root.setLeftChild(root.getRightChild());
		root.setRightChild(temp);

	}

	private static void printMaxDepthBST(int maxDepthOfBST) {
		System.out.println("Max Depth is " + maxDepthOfBST);
	}

	private static int findMaxDepth(Node root) {

		if (root == null) {
			return 0;
		}

		if (root.getLeftChild() == null && root.getRightChild() == null) {
			return 0;
		}
		System.out.println("root is " + root.getData());
		if (root.getLeftChild() != null)
			System.out.println("Left Child is " + root.getLeftChild().getData());
		int leftMaxDepth = findMaxDepth(root.getLeftChild()) + 1;
		if (root.getRightChild() != null)
			System.out.println("Right Child is " + root.getRightChild().getData());
		int rightMaxDepth = findMaxDepth(root.getRightChild()) + 1;
		System.out.println("Max Depth is " + Math.max(leftMaxDepth, rightMaxDepth));
		return Math.max(leftMaxDepth, rightMaxDepth);

	}

	private static Node findMaximumValue(Node root) {
		if (root == null) {
			return null;
		}
		if (root.getRightChild() == null) {
			return root;
		}

		return findMaximumValue(root.getRightChild());
	}

	private static Node findMinimumValue(Node root) {
		if (root == null) {
			return null;
		}
		if (root.getLeftChild() == null) {
			return root;
		}

		return findMinimumValue(root.getLeftChild());

	}

}
