package harsha.practice.sorting;

import harsha.practice.commons.SortingHelpingMethods;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = SortingHelpingMethods.getArray();
		int incrementValue = 5;
		for (int i = 0; i < incrementValue; i++) {
			sortArray(arr, i, incrementValue);
		}
		sortArray(arr, 0, 1);
		SortingHelpingMethods.printElements(arr);
	}

	private static void sortArray(int[] arr, int startingFrom, int incValue) {
		for (int i = startingFrom; i < arr.length - incValue; i = i + incValue) {
			for (int j = i + incValue; j-incValue >= 0; j = j - incValue) {
				if (arr[j] < arr[j - incValue]) {
					SortingHelpingMethods.swapElements(arr, j-incValue, j);
				} else {
					break;
				}
			}
		}
	}

}
