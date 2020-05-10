package harsha.practice.sorting;

import harsha.practice.commons.SortingHelpingMethods;

public class MergeSortRetest {

	public static void main(String[] args) {
		int arr[] = SortingHelpingMethods.getArray();
		long t1 = System.currentTimeMillis();
		mergeSort(arr);
		System.out.println(System.currentTimeMillis() - t1);
		SortingHelpingMethods.printElements(arr);
	}

	private static void mergeSort(int[] arr) {
		if (arr.length == 1) {
			return;
		}
		int midIndex = (arr.length / 2) + (arr.length % 2);
		int[] firstArr = new int[midIndex];
		int[] secondArr = new int[arr.length - midIndex];
		split(arr, firstArr, secondArr);
		mergeSort(firstArr);
		mergeSort(secondArr);
		swapAndMerge(arr, firstArr, secondArr);
	}

	private static void swapAndMerge(int[] arr, int[] firstArr, int[] secondArr) {
		int firstArrIndex = 0, secondArrIndex = 0, commonIndex = 0;
		while (firstArrIndex < firstArr.length && secondArrIndex < secondArr.length) {
			if (firstArr[firstArrIndex] < secondArr[secondArrIndex]) {
				arr[commonIndex++] = firstArr[firstArrIndex++];
			} else {
				arr[commonIndex++] = secondArr[secondArrIndex++];
			}
		}

		if (firstArrIndex < firstArr.length) {
			while (commonIndex < arr.length) {
				arr[commonIndex++] = firstArr[firstArrIndex++];
			}
		}

		if (secondArrIndex < secondArr.length) {
			while (commonIndex < arr.length) {
				arr[commonIndex++] = secondArr[secondArrIndex++];
			}
		}

	}

	private static void split(int[] arr, int[] firstArr, int[] secondArr) {

		for (int i = 0; i < arr.length; i++) {
			if (i < firstArr.length) {
				firstArr[i] = arr[i];
			} else {
				secondArr[i - firstArr.length] = arr[i];
			}
		}

	}

}
