package harsha.practice.sorting;

import harsha.practice.commons.SortingHelpingMethods;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = SortingHelpingMethods.getArray();

		for (int i = 0; i < arr.length - 1; i++) {
			boolean areElementsSwapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				areElementsSwapped = SortingHelpingMethods.swapElements(arr, j, j + 1);
			}
			if (!areElementsSwapped) {
				break;
			}
		}
		SortingHelpingMethods.printElements(arr);
	}
}
