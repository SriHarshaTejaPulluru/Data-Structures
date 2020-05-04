package harsha.practice.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 9, 8, 6, 5, 4, 2, 1 };
		mergeSort(arr);
		print(arr);
	}

	private static void mergeSort(int[] fullArr) {
		if (fullArr.length == 1) {
			return;
		}
		int midIx = (fullArr.length / 2) + (fullArr.length % 2);
		int[] firstHalfArr = new int[midIx];
		int[] secondHalfArr = new int[fullArr.length - midIx];
		split(fullArr, firstHalfArr, secondHalfArr);
		mergeSort(firstHalfArr);
		mergeSort(secondHalfArr);
		swapAndMerge(fullArr, firstHalfArr, secondHalfArr);
	}

	private static void print(int[] arr) {
		for (int x : arr) {
			System.out.println(x);
		}
	}

	private static void split(int[] fullArr, int[] firstHalfArr, int[] secondHalfArr) {
		int secondArrStrtIndex = firstHalfArr.length;
		for (int i = 0; i < firstHalfArr.length + secondHalfArr.length; i++) {
			if (i < secondArrStrtIndex) {
				firstHalfArr[i] = fullArr[i];
			} else {
				secondHalfArr[i - secondArrStrtIndex] = fullArr[i];
			}
		}
	}

	private static void swapAndMerge(int[] listToSort, int[] listFirstHalf, int[] listSecondHalf) {

		int commonIndex = 0;
		int firstHalfIndex = 0;
		int secondHalfIndex = 0;

		while (firstHalfIndex < listFirstHalf.length && secondHalfIndex < listSecondHalf.length) {
			if (listFirstHalf[firstHalfIndex] < listSecondHalf[secondHalfIndex]) {
				listToSort[commonIndex++] = listFirstHalf[firstHalfIndex++];
			} else if (listSecondHalf[secondHalfIndex] < listFirstHalf[firstHalfIndex]) {
				listToSort[commonIndex++] = listSecondHalf[secondHalfIndex++];
			}
		}

		if (firstHalfIndex < listFirstHalf.length) {
			while (commonIndex < listToSort.length) {
				listToSort[commonIndex++] = listFirstHalf[firstHalfIndex++];
			}
		}

		if (secondHalfIndex < listSecondHalf.length) {
			while (commonIndex < listToSort.length) {
				listToSort[commonIndex++] = listSecondHalf[secondHalfIndex++];
			}
		}
	}
}
