package harsha.practice.commons;

/**
 * This class is a helper methods class used for different sorting techniques
 * 
 * @author Harsha.Pulluru
 *
 */
public class SortingHelpingMethods {

	private static int[] array;
	static final int BOUNDARY_LIMIT = 1000;

	public static int[] getArray() {
		array = new int[BOUNDARY_LIMIT];
		for (int i = 0, j = BOUNDARY_LIMIT; i < BOUNDARY_LIMIT; i++, j--) {
			array[i] = j;
		}
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
