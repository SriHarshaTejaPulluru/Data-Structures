package harsha.practice.trees;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class DepthFirstSearch {

	public static void main(String[] args) {

		Node root = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		Node f = new Node("F");
		Node g = new Node("G");
		Node h = new Node("H");
		root.setLeftChild(b);
		root.setRightChild(c);
		c.setLeftChild(d);
		c.setRightChild(e);
		d.setLeftChild(f);
		d.setRightChild(h);
		e.setRightChild(g);
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

	private static void inOrderTraversal(Node root) {

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
