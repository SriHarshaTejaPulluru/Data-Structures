package harsha.practice.sorting;

import harsha.practice.commons.HelperUtility;

public class SelectionSortReTest {

	public static void main(String[] args) {

		int[] arr = HelperUtility.getArray();
		long t1 = System.currentTimeMillis();
		selectionSort(arr);
		System.out.println(System.currentTimeMillis() - t1);
		HelperUtility.printElements(arr);

	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					HelperUtility.swapElements(arr, i, j);
				}
			}
		}
	}

}
