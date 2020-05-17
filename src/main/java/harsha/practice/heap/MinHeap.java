package harsha.practice.heap;

@SuppressWarnings("rawtypes")
public class MinHeap<T extends Comparable> extends Heap<T> {

	public MinHeap(Class<T> clazz) {
		super(clazz);
	}

	public MinHeap(Class<T> clazz, int size) {
		super(clazz, size);
	}

	public static void main(String[] args) throws HeapEmptyException, HeapFullException {
		MinHeap<Integer> minHeap = new MinHeap<>(Integer.class);
		minHeap.insertElementToMinHeap(10);
		minHeap.insertElementToMinHeap(8);
		// minHeap.printHeap();
		minHeap.insertElementToMinHeap(9);
		minHeap.insertElementToMinHeap(2);
		minHeap.insertElementToMinHeap(15);
		minHeap.insertElementToMinHeap(65);
		minHeap.insertElementToMinHeap(1);
		//minHeap.printHeap();
		minHeap.removeHighestPriorityElement();
		minHeap.printHeap();
	}

	public void siftDown(int index) {
		if (index <= -1 || index > ARRAY_MAX_SIZE) {
			return;
		}
		int leftChildIndex = getLeftChildIndex(index);
		int rightChildIndex = getRightChildIndex(index);

		if (leftChildIndex <= -1 || rightChildIndex <= -1 || leftChildIndex > ARRAY_MAX_SIZE - 1
				|| rightChildIndex > ARRAY_MAX_SIZE - 1) {
			return;
		}
		T parentValue = getElementAtIndex(index);
		T leftChildValue = getElementAtIndex(leftChildIndex);
		T rightChildValue = getElementAtIndex(rightChildIndex);

		int rightCompare = parentValue.compareTo(rightChildValue);
		int leftCompare = parentValue.compareTo(leftChildValue);
		boolean isValidCompare = leftCompare > 0 || rightCompare > 0 ? true : false;
		if (isValidCompare) {
			if (rightCompare > 0) {
				swap(index, rightChildIndex);
				siftDown(rightChildIndex);
			} else {
				swap(index, leftChildIndex);
				siftDown(index);
			}
		} else {
			return;
		}
	}

	public void siftUp(int index) {

		if (index <= -1) {
			return;
		}
		int parentIndex = getParentIndex(index);
		T parentIndexValue = getElementAtIndex(parentIndex);
		if (parentIndexValue.compareTo(getElementAtIndex(index)) > 0) {
			swap(parentIndex, index);
			siftUp(parentIndex);
		}
	}

}
