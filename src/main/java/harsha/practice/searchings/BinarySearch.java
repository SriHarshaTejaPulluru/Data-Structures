package harsha.practice.searchings;

import harsha.practice.commons.HelperUtility;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = HelperUtility.getArray();
		int index = binarySearch(arr, 700);
		System.out.println("Index is " + index);
	}

	private static int binarySearch(int[] arr, int numberToBeSearched) {
		int midIndex ;
		int minIndex = 0;
		int maxIndex = arr.length - 1;
		while (minIndex <= maxIndex) {
			midIndex = ((minIndex+maxIndex)/2)+((minIndex+maxIndex)%2);
			if (arr[midIndex] == numberToBeSearched) {
				return midIndex;
			}

			if (arr[midIndex] >= numberToBeSearched) {
				maxIndex = midIndex - 1;
			} else {
				minIndex = midIndex + 1;
			}
		}
		return -1;
	}

}
