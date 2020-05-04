package harsha.practice.queue;

public class QueueDemo {

	public static void main(String[] args) {

		/*CircularQueueLogic<String> circularQueue = new CircularQueueLogic<>(String.class);
		circularQueue.enqueue("Sri");
		circularQueue.enqueue("Harsha");
		circularQueue.enqueue("Teja");
		circularQueue.enqueue("Pulluru");
		circularQueue.dequeue();
		circularQueue.showQueue();*/
		
		QueueUsing2StacksLogic<String> queueUsing2Stacks= new QueueUsing2StacksLogic<String>();
		queueUsing2Stacks.enqueue("Sri");
		queueUsing2Stacks.enqueue("Harsha");
		queueUsing2Stacks.enqueue("Teja");
		queueUsing2Stacks.enqueue("Pulluru");
		queueUsing2Stacks.dequeue();
		queueUsing2Stacks.showQueue();
	}

}
