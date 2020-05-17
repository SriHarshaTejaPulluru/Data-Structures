package harsha.practice.sorting;

import harsha.practice.commons.HelperUtility;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = HelperUtility.getArray();
		int incrementValue = 5;
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < incrementValue; i++) {
			sortArray(arr, i, incrementValue);
		}
		sortArray(arr, 0, 1);
		System.out.println(System.currentTimeMillis() - t1);
		HelperUtility.printElements(arr);
	}

	private static void sortArray(int[] arr, int startingFrom, int incValue) {
		for (int i = startingFrom; i < arr.length - incValue; i = i + incValue) {
			for (int j = i + incValue; j - incValue >= 0; j = j - incValue) {
				if (arr[j] < arr[j - incValue]) {
					HelperUtility.swapElements(arr, j - incValue, j);
				} else {
					break;
				}
			}
		}
	}

}
