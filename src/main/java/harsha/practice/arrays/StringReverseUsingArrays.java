package harsha.practice.arrays;

public class StringReverseUsingArrays {

	public static void main(String[] args) {

		String str = "Hello I am Harsha";
		char[] charArr = new char[str.length()];
		for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
			charArr[j] = str.charAt(i);
		}
		System.out.println(String.valueOf(charArr));
	}

}
