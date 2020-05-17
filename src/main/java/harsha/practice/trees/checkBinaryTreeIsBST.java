package harsha.practice.trees;

import harsha.practice.commons.HelperUtility;

public class checkBinaryTreeIsBST {

	public static void main(String[] args) {

		Node root = HelperUtility.getRoot();

		System.out.println(checkBSTOrNot(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

	}

	private static boolean checkBSTOrNot(Node<Integer> root, int minValue, int maxValue) {

		if (root == null) {
			return true;
		}
		if (root.getData() <= minValue || root.getData() > maxValue) {
			return false;
		}
		return checkBSTOrNot(root.getLeftChild(), minValue, root.getData())
				&& checkBSTOrNot(root.getRightChild(), root.getData(), maxValue);
	}

}
