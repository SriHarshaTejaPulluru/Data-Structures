package harsha.practice.sorting;

import harsha.practice.commons.HelperUtility;

public class QuickSortReTest {

	public static void main(String[] args) {
		int[] arr = HelperUtility.getArray();
		long t1 = System.currentTimeMillis();
		quickSort(arr, 0, arr.length-1);
		System.out.println(System.currentTimeMillis() - t1);
		HelperUtility.printElements(arr);
	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low >= high) {
			return;
		}
		int pivotIndex = divideArr(arr, low, high);
		quickSort(arr, low, pivotIndex-1);
		quickSort(arr, pivotIndex + 1, high);

	}

	private static int divideArr(int[] arr, int low, int high) {
		int pivotElement = arr[low];
		int l = low, h = high;
		while (l < h) {

			while (arr[l] <= pivotElement && l < h) {
				l++;
			}
			while (arr[h] > pivotElement) {
				h--;
			}
			if (l < h) {
				HelperUtility.swapElements(arr, l, h);
			}
		}
		HelperUtility.swapElements(arr, low, h);

		return h;
	}
}
