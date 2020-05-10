package harsha.practice.sorting;

import harsha.practice.commons.SortingHelpingMethods;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = SortingHelpingMethods.getArray();
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < arr.length - 1; i++) {
			boolean areElementsSwapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					SortingHelpingMethods.swapElements(arr, j, j + 1);
					areElementsSwapped = true;
				}
			}
			if (!areElementsSwapped) {
				break;
			}
		}
		System.out.println(System.currentTimeMillis() - t1);
		SortingHelpingMethods.printElements(arr);
	}
}
