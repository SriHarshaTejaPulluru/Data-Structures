package harsha.practice.trees;

import harsha.practice.queue.CircularQueueLogic;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class BreadthFirstSearchTraversal {

	public static void main(String[] args) {

		Node root = new Node("A");
		Node b = new Node("BG");
		Node c = new Node("Cd");
		Node d = new Node("DF");
		Node e = new Node("AE");
		Node f = new Node("HF");
		Node g = new Node("GA");
		root.setLeftChild(b);
		root.setRightChild(c);
		b.setLeftChild(d);
		c.setLeftChild(e);
		c.setRightChild(f);
		f.setRightChild(g);
		breadthFirstSearch(root);
	}

	private static void print(Node node) {
		System.out.print(node.getData() + "->");
	}

	private static void breadthFirstSearch(Node root) {

		if (root == null) {
			return;
		}
		CircularQueueLogic<Node> queue = new CircularQueueLogic(Node.class);
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			Node node = queue.dequeue();
			print(node);

			if (node.getLeftChild() != null) {
				queue.enqueue(node.getLeftChild());
			}
			if (node.getRightChild() != null) {
				queue.enqueue(node.getRightChild());
			}
		}
	}

}
