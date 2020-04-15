package harsha.practice.commons;

/**
 * This class is a helper methods class used for different sorting techniques
 * 
 * @author Harsha.Pulluru
 *
 */
public class SortingHelpingMethods {

	private static int[] array = new int[] { 5, 8, 1, 3, 2, 6, 4, 10, 9, 7 };

	public static int[] getArray() {
		return array;
	}

	public static void printElements(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	public static void swapElements(int[] arr, int i, int j) {
		int temp;
		temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;

	}
}
