package harsha.pratice.recursions;

public class FactorialRecursion {

	public static void main(String[] args) {

		System.out.println(fact(4));
	}

	static int fact(int n) {
		if (n == 1) {
			return 1;
		} else {
			System.out.println(n);
			int a= n * fact(n - 1);
			System.out.println(n);
			return a;
		}
	}

}
