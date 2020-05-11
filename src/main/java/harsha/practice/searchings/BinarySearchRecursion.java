package harsha.practice.searchings;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 5, 8, 9 };
		int answer = binarySearch(arr, 0, arr.length - 1, 7);
		System.out.println(answer);
	}

	private static int binarySearch(int[] arr, int low, int high, int numberToBeSearched) {
		int midIndex = ((low + high) / 2) + ((low + high) % 2);
		System.out.println("low is " + low + " MidIndex is " + midIndex + " High is " + high);
		if (low <= high) {
			if (arr[midIndex] == numberToBeSearched) {
				return midIndex;
			}
			if (arr[midIndex] >= numberToBeSearched) {
				high = midIndex - 1;
				return binarySearch(arr, low, high, numberToBeSearched);
			} else {
				low = midIndex + 1;
				return binarySearch(arr, low, high, numberToBeSearched);
			}

		} else {
			return -1;
		}
	}
}
