package harsha.practice.sorting;

import harsha.practice.commons.HelperUtility;

public class QuickSort {

	public static void main(String[] args) {

		int[] fullArr = new int[] { 6, 5, 11, 4, 2, 5, 10, 3, 7, 8, 9 };

		quickSort(fullArr, 0, fullArr.length - 1);
		HelperUtility.printElements(fullArr);
	}

	private static void quickSort(int[] fullArr, int low, int high) {

		if (low >= high) {
			return;
		}
		int pivotIndex = divideArray(fullArr, low, high);
		quickSort(fullArr, low, pivotIndex - 1);
		quickSort(fullArr, pivotIndex + 1, high);

	}

	private static int divideArray(int[] arrToDivide, int low, int high) {
		int pivotElement = arrToDivide[low];
		int l = low;
		int h = high;
		while (l < h) {
			while (arrToDivide[l] <= pivotElement && l < h) {
				l++;
			}

			while (arrToDivide[h] > pivotElement) {
				h--;
			}
			if (l < h) {
				HelperUtility.swapElements(arrToDivide, l, h);
			}
		}
		HelperUtility.swapElements(arrToDivide, low, h);

		return h;
	}

}
