package harsha.practice.heap;

public class HeapProblems {
	static int[] array = new int[] { 5, 81, 6, 9, 12, 11, 7, 15, 88 };
	//static int[] randomArray= new int[] {2, 5, 6, 21, 67, 88, 4, 1, 3, 9, 99};
	public static void main(String[] args) throws HeapFullException, HeapEmptyException {
		//System.out.println(finMaxEle());
		printKMaxElemets(3);
	}

	public static int finMaxEle() {
		int endIndex = array.length - 1;
		int lastParentIndex = getParentIndex(endIndex);
		int firstChildIndex = lastParentIndex + 1;

		int maxElement = array[endIndex];
		for (int i = firstChildIndex; i < endIndex; i++) {
			if (array[i] > maxElement) {
				maxElement = array[i];
			}
		}
		return maxElement;
	}
	
	public static void printKMaxElemets(int k) throws HeapFullException, HeapEmptyException{
		MinHeap<Integer> minHeap= new MinHeap<>(Integer.class,k);
		for(int number:array){
			
			if(minHeap.isHeapEmpty()){
				minHeap.insertElementToMinHeap(number);
			}
			else if( !minHeap.isHeapFull() || number > minHeap.getHighestPriorityElement()){
				if(minHeap.isHeapFull()){
					minHeap.removeHighestPriorityElement();
				}
				minHeap.insertElementToMinHeap(number);
			}
		}
		minHeap.printHeap();
	}

	public static int getParentIndex(int index) {
		return (index - 1) / 2;
	}

}