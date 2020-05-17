package harsha.practice.sorting;

import harsha.practice.commons.HelperUtility;

public class InsertionSortReTest {

	public static void main(String[] args) {

		int[] arr = HelperUtility.getArray();
		long t1 = System.currentTimeMillis();
		insertionSort(arr);
		System.out.println(System.currentTimeMillis() - t1);
		HelperUtility.printElements(arr);
	}

	private static void insertionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					HelperUtility.swapElements(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

}
