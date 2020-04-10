package harsha.practice.queue;

public class CircularQueueDemo {

	public static void main(String[] args) {

		CircularQueueLogic<String> circularQueue = new CircularQueueLogic<>(String.class);
		circularQueue.enqueue("Sri");
		circularQueue.enqueue("Harsha");
		circularQueue.enqueue("Teja");
		circularQueue.enqueue("Pulluru");
		circularQueue.dequeue();
		circularQueue.showQueue();
	}

}
