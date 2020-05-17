package harsha.practice.heap;

public class HeapSort {
	static int[] array = new int[] { 4, 6, 9, 2, 10, 56, 12, 5, 1, 17, 14 };

	public static void main(String args[]) {
		heapSort();
		printSortedArray();
	}

	private static void printSortedArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void heapSort() {
		heapify(array.length - 1);
		int endIndex = array.length - 1;
		while (endIndex >= 0) {
			swap(0, endIndex);
			endIndex--;
			heapifyAccordingToIndexes(0, endIndex);
		}
	}

	public static void heapify(int endIndex) {
		int index = getParentIndex(endIndex);
		while (index >= 0) {
			heapifyAccordingToIndexes(index, endIndex);
			index--;
		}
	}

	public static void heapifyAccordingToIndexes(int parentIndex, int endIndex) {

		int leftIndex = getChildIndex(parentIndex, endIndex, LEFT);
		int rightIndex = getChildIndex(parentIndex, endIndex, RIGHT);

		if (leftIndex != -1 && getElementAtIndex(leftIndex) > getElementAtIndex(parentIndex)) {
			swap(leftIndex, parentIndex);
			heapifyAccordingToIndexes(leftIndex, endIndex);
		}
		if (rightIndex != -1 && getElementAtIndex(rightIndex) > getElementAtIndex(parentIndex)) {
			swap(rightIndex, parentIndex);
			heapifyAccordingToIndexes(rightIndex, endIndex);
		}

	}

	private static int getElementAtIndex(int index) {
		return array[index];
	}

	private static final String RIGHT = "Right";
	private static final String LEFT = "Left";

	public static int getChildIndex(int parentIndex, int endIndex, String childIndexSide) {

		int childIndex = 2 * parentIndex;

		if (LEFT.equals(childIndexSide)) {
			childIndex = childIndex + 1;
		} else {
			childIndex = childIndex + 2;
		}

		if (childIndex > endIndex) {
			return -1;
		}
		return childIndex;
	}

	public static int getParentIndex(int childIndex) {

		return (childIndex - 1) / 2;
	}

	public static void swap(int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
