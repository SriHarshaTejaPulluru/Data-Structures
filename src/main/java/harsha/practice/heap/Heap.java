package harsha.practice.heap;

import java.lang.reflect.Array;

/**
 * @author Teja
 *
 * @param <T>
 *            Templatized parameter can be either String, Integer
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public abstract class Heap<T extends Comparable> {

	static int ARRAY_MAX_SIZE = 10;
	T[] array;
	int count = 0;

	public Heap(Class<T> clazz) {
		this(clazz, ARRAY_MAX_SIZE);
	}

	public Heap(Class<T> clazz, int size) {
		array = (T[]) Array.newInstance(clazz, size);
	}

	public abstract void siftDown(int index);

	public abstract void siftUp(int index);

	public T getElementAtIndex(int index) {
		return array[index];
	}

	public void swap(int parentIndex, int childIndex) {
		T temp = array[parentIndex];
		array[parentIndex] = array[childIndex];
		array[childIndex] = temp;
	}

	public static int getParentIndex(int index) {
		if (index <= -1) {
			return -1;
		}
		return (index - 1) / 2;
	}

	public static int getLeftChildIndex(int parentIndex) {
		if (parentIndex <= -1) {
			return -1;
		}
		return (2 * parentIndex) + 1;
	}

	public static int getRightChildIndex(int parentIndex) {
		if (parentIndex <= -1) {
			return -1;
		}
		return 2 * parentIndex + 2;
	}

	public void insertElementToMinHeap(T value) throws HeapFullException {
		if (count>=array.length) {
			throw new HeapFullException();
		}
		System.out.println("Array Length "+array.length);
		array[count] = value;
		siftUp(count);
		count++;
	}

	public boolean isHeapFull() {
		if (count == array.length) {
			return true;
		}
		return false;
	}

	public boolean isHeapEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	public T removeHighestPriorityElement() throws HeapEmptyException {
		T highestPriorityValue = getHighestPriorityElement();
		array[0] = array[count - 1];
		count--;
		siftDown(0);
		return highestPriorityValue;
	}

	public void printHeap() {
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + ",");
		}
	}

	public T getHighestPriorityElement() throws HeapEmptyException {
		if (count == 0) {
			throw new HeapEmptyException();
		}
		return array[count - 1];
	}

}
