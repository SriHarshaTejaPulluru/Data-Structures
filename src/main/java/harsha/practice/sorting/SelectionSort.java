package harsha.practice.sorting;

import harsha.practice.commons.SortingHelpingMethods;

/**
 * 
 * Sorting below by ascending order - Time Complexity - O(n^2) and space
 * complexity - O(1)->for temp variable
 * 
 * Not used much, but you have a constraint of space complexity - we can go with
 * this, else, no!
 * 
 * @author Harsha.Pulluru
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = SortingHelpingMethods.getArray();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				SortingHelpingMethods.swapElements(arr, i, j);
			}
		}
		SortingHelpingMethods.printElements(arr);
	}

}