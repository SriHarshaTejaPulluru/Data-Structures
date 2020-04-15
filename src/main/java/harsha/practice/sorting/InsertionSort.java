package harsha.practice.sorting;

import harsha.practice.commons.SortingHelpingMethods;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = SortingHelpingMethods.getArray();
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					SortingHelpingMethods.swapElements(arr, j-1, j);
				} else {
					break;
				}
			}
		}
		SortingHelpingMethods.printElements(arr);
		System.out.println();
		System.out.println(System.currentTimeMillis() - t1);
	}

}
