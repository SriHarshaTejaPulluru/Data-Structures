package harsha.practice.commons;

/**
 * This class is a helper methods class used for different sorting techniques
 * 
 * @author Harsha.Pulluru
 *
 */
public class SortingHelpingMethods {

	private static int[] array = new int[] { 1, 2, 5, 4, 7, 9 };

	public static int[] getArray() {
		return array;
	}

	public static void printElements(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	public static boolean swapElements(int[] arr, int i, int j) {
		int temp;
		boolean areElementsSwapped = false;
		System.out.print("arr[j] " + arr[j]);
		System.out.print(" arr[i] " + arr[i]);
		if (arr[j] < arr[i]) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			areElementsSwapped = true;
			System.out.print(" Elements swapped");
		}
		System.out.println();
		return areElementsSwapped;
	}
}
