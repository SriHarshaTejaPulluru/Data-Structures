package harsha.practice.stack;

/**
 * 
 * Problem statement is finding minimum element in stack with constant time
 * complexity i.e. O(1) and not bothered about space complexity
 * 
 * @author Harsha.Pulluru
 *
 */
public class FindingMinimumElementInStack {

	public static void main(String[] args) {
		MinimumStack minStack = new MinimumStack();
		/*minStack.push(3);
		minStack.push(5);
	minStack.push(2);
		minStack.push(9);*/
		System.out.println(minStack.minimumElement());
	}

}
