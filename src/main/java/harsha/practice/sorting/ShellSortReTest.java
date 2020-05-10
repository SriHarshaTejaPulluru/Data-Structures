package harsha.practice.sorting;

import harsha.practice.commons.SortingHelpingMethods;

public class ShellSortReTest {

	public static void main(String[] args) {

		int[] arr = SortingHelpingMethods.getArray();
		long t1 = System.currentTimeMillis();
		int incrementValue = 2, temp = 2;
		for (int i = 0; i < temp; i++) {
			shellSort(arr, i, incrementValue);
		}
		shellSort(arr, 0, 1);
		System.out.println(System.currentTimeMillis() - t1);
		SortingHelpingMethods.printElements(arr);
	}

	private static void shellSort(int[] arr, int startingIndex, int incrementValue) {
		for (int i = startingIndex; i < arr.length - incrementValue; i = i + incrementValue) {
			for (int j = i + incrementValue; j >= incrementValue; j = j - incrementValue) {
				if (arr[j] < arr[j - incrementValue]) {
					SortingHelpingMethods.swapElements(arr, j - incrementValue, j);
				} else {
					break;
				}
			}
		}
	}
}
