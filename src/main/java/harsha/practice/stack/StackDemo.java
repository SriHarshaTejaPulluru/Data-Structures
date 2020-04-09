package harsha.practice.stack;

public class StackDemo {

	public static void main(String[] args) {

		StackLogic<String> stackOfNames = new StackLogic<String>();
		stackOfNames.peek();
		stackOfNames.push("Teja");
		stackOfNames.push("Harsha");
		stackOfNames.push("Sri");
		stackOfNames.peek();
		try {
			System.out.println(stackOfNames.pop());
		} catch (Exception e) {
			System.out.println(e);
		}
		stackOfNames.peek();
		stackOfNames.showStack();
	}

}
