package harsha.pratice.recursions;

public class FactorialRecursion {

	public static void main(String[] args) {

		fact(4);
		printNumber(4);
	}

	private static void printNumber(int i) {
		System.out.println("value is " + i);
		if (i == 1) {
			return;
		}
		printNumber(i - 1);
	}

	static int fact(int n) {
		if (n == 1) {
			return 1;
		} else {
			System.out.println(n);
			int a = n * fact(n - 1);
			System.out.println(n);
			return a;
		}
	}

}
