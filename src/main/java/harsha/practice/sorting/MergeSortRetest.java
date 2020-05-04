package harsha.practice.sorting;

public class MergeSortRetest {

	public static void main(String[] args) {
		int[] arr = { 67, 4, 34, 22, 1 };
		mergeSort(arr);
		print(arr);
	}

	private static void print(int[] finalArr) {
		for (int value : finalArr) {
			System.out.println(value);
		}
	}

	private static void mergeSort(int[] fullArr) {

		if (fullArr.length == 1) {
			return;
		}
		int[] firstHalfArr = new int[(fullArr.length / 2) + (fullArr.length % 2)];
		int[] secondHalfArr = new int[fullArr.length - firstHalfArr.length];

		split(fullArr, firstHalfArr, secondHalfArr);
		mergeSort(firstHalfArr);
		mergeSort(secondHalfArr);
		swapAndMerge(fullArr, firstHalfArr, secondHalfArr);
	}

	private static void swapAndMerge(int[] listToSort, int[] firstHalfArr, int[] secondHalfArr) {
		int firstHalfIndex = 0;
		int secondHalfIndex = 0;
		int commonIndex = 0;
		while (firstHalfIndex < firstHalfArr.length && secondHalfIndex < secondHalfArr.length) {
			if (firstHalfArr[firstHalfIndex] < secondHalfArr[secondHalfIndex]) {
				listToSort[commonIndex++] = firstHalfArr[firstHalfIndex++];
			} else if (firstHalfArr[firstHalfIndex] > secondHalfArr[secondHalfIndex]) {
				listToSort[commonIndex++] = secondHalfArr[secondHalfIndex++];
			}
		}

		if (secondHalfIndex < secondHalfArr.length) {
			while (commonIndex < listToSort.length) {
				listToSort[commonIndex++] = secondHalfArr[secondHalfIndex++];
			}
		}

		if (firstHalfIndex < firstHalfArr.length) {
			while (commonIndex < listToSort.length) {
				listToSort[commonIndex++] = firstHalfArr[firstHalfIndex++];
			}
		}
	}

	private static void split(int[] fullArr, int[] firstHalfArr, int[] secondHalfArr) {
		for (int i = 0; i < fullArr.length; i++) {
			if (i < firstHalfArr.length) {
				firstHalfArr[i] = fullArr[i];
			} else {
				secondHalfArr[i - firstHalfArr.length] = fullArr[i];
			}
		}
	}

}
