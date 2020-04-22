package harsha.practice.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 3, 1, 8, 9 };
		mergeSort(arr);
	}

	private static void mergeSort(int[] fullArr) {
		if(fullArr.length==1) {
			return;
		}
		int midIx = (fullArr.length / 2) + (fullArr.length % 2);
		int[] firstHalfArr = new int[midIx];
		int[] secondHalfArr = new int[fullArr.length - midIx];
		split(fullArr, firstHalfArr, secondHalfArr);
		mergeSort(firstHalfArr);
		mergeSort(secondHalfArr);
		/*System.out.println("yo");
		print(firstHalfArr);
		System.out.println("yo1");*/
		//print(fullArr);
	}

	private static void print(int[] arr) {
		for (int x : arr) {
			System.out.println(x);
		}
		System.out.println("yo1");
	}

	private static void split(int[] fullArr, int[] firstHalfArr, int[] secondHalfArr) {
		int secondArrStrtIndex = firstHalfArr.length;
		for (int i = 0; i < firstHalfArr.length + secondHalfArr.length; i++) {
			if (i < secondArrStrtIndex) {
				firstHalfArr[i] = fullArr[i];
			} else {
				secondHalfArr[i - secondArrStrtIndex] = fullArr[i];
			}
		}
		/*print(firstHalfArr);
		print(secondHalfArr);*/
	}
}
